package dao;

import java.sql.SQLException;
import java.util.List;

import custom_exc.EmployeeHandlingException;
import pojos.Employee;

public interface IEmployeeDao {
	// fetch emp details by date n sal range
	List<Employee> fetchEmpDetails(String joinDate, double lowerSal, double upperSal) throws SQLException;
	//fetch emp details by id
	Employee fetchEmpDetailsById(int empId) throws SQLException,EmployeeHandlingException;
	//hire emp : insert new emp details
	String insertEmpDetail(Employee newEmp)throws SQLException;
	//update salary
	String updateEmpDetails(double salIncr,String newDept,int empId) throws SQLException;
	//delete emp details
	String deleteEmpDetails(int empId)throws SQLException;
}
