package dao;

import static utils.DBUtils.getDBConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import custom_exc.EmployeeHandlingException;
import pojos.Employee;

public class EmployeeDaoImpl implements IEmployeeDao {
	// state : data members
	private Connection cn;
	private PreparedStatement pst1, pst2, pst3, pst4,pst5;

	// constr : invoked by Tester : exactly once : init phase of the app (before
	// user joins in)
	public EmployeeDaoImpl() throws Exception {
		// get cn from DBUtils
		cn = getDBConnection();
		// pst1
		String sql = "select empid,name,salary from my_emp where join_date > ? and salary between ? and ?";
		pst1 = cn.prepareStatement(sql);//pst => pre parsed n pre-compiled stmt
		// pst2
		pst2 = cn.prepareStatement("select * from my_emp where empid=?");
		// pst3 : insert emp details
		pst3 = cn.prepareStatement("insert into my_emp values(default,?,?,?,?,?)");
		// pst4 : update details
		pst4 = cn.prepareStatement("update my_emp set salary=salary+?,deptid=? where empid=?");
		//delete
		pst5=cn.prepareStatement("delete from my_emp where empid=?");
		System.out.println("emp dao inited....");
	}

	@Override
	public List<Employee> fetchEmpDetails(String joinDate, double lowerSal, double upperSal) throws SQLException {
		// invoked by Tester , multiple times once per request
		// set IN params
		pst1.setDate(1, Date.valueOf(joinDate));//string-> join date(java.sql.Date)
		pst1.setDouble(2, lowerSal);
		pst1.setDouble(3, upperSal);//1, 2, 3 : placeholder positions (In param pos, counted from left to right onwards
		// create empty emp list
		List<Employee> list = new ArrayList<>();
		// exec query
		try (ResultSet rst = pst1.executeQuery()) {
			//rst cursor : before the 1st row
			while (rst.next())
				list.add(new Employee(rst.getInt(1), rst.getString(2), rst.getDouble(3)));
		}

		return list;// DAO rets populated list of emps (pojo) representing data from DB , to the
					// caller
	}

	@Override
	public Employee fetchEmpDetailsById(int empId) throws SQLException, EmployeeHandlingException {
		// set IN param : emp id
		pst2.setInt(1, empId);
		try (ResultSet rst = pst2.executeQuery()) {
			if (rst.next())
				return new Employee(empId, rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getString(5),
						rst.getDate(6));
		}
		// emp id invalid
		throw new EmployeeHandlingException("Invalid Emp id!!!!!");
	}

	@Override
	public String insertEmpDetail(Employee newEmp) throws SQLException {
		// set IN params
		pst3.setString(1, newEmp.getName());// nm
		pst3.setString(2, newEmp.getAddress());// address
		pst3.setDouble(3, newEmp.getSalary());// sal
		pst3.setString(4, newEmp.getDeptId());// dept
		pst3.setDate(5, newEmp.getJoinDate());// join date
		int updateCount = pst3.executeUpdate();// rets no of recs ins/update/delete
		if (updateCount == 1)
			return "Emp info inserted successfully....";

		return "Emp info insertion failed!!!!!";
	}

	@Override
	public String updateEmpDetails(double salIncr, String newDept, int empId) throws SQLException {
		// set IN params
		pst4.setDouble(1, salIncr);
		pst4.setString(2, newDept);
		pst4.setInt(3, empId);
		// exec update

		int updateCount = pst4.executeUpdate();// rets no of recs ins/update/delete
		if (updateCount == 1)
			return "Emp info updated successfully....";

		return "Emp info updation failed!!!!!";
	}
	
	

	@Override
	public String deleteEmpDetails(int empId) throws SQLException {
		// set In params
		pst5.setInt(1, empId);
		int updateCount = pst5.executeUpdate();// rets no of recs ins/update/delete
		if (updateCount == 1)
			return "Emp info deleted successfully....";

		return "Emp info deletion failed!!!!!";
		
	}

	// clean up : invoked by Tester : once @ closing of app
	public void cleanUp() throws SQLException {
		if (pst1 != null)
			pst1.close();
		if (pst2 != null)
			pst2.close();
		if (pst3 != null)
			pst3.close();
		if (pst4 != null)
			pst4.close();
		if (pst5 != null)
			pst5.close();
		if (cn != null)
			cn.close();
		System.out.println("emp dao cleaned up....");
	}

}
