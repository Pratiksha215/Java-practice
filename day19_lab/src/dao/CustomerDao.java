package dao;

import static utils.DBUtils.getDBConnection;
import java.sql.*;

import pojos.Customer;

public class CustomerDao implements ICustomerDao {
	private Connection cn;
	private PreparedStatement ps1, ps2, ps3;

	public CustomerDao() throws ClassNotFoundException, SQLException {
		cn = getDBConnection();
		// User Login
		ps1 = cn.prepareStatement("select * from my_customers where email=? and password=?");
		// New User registration
		ps2 = cn.prepareStatement("insert into my_customers values(default,?,?,?,?,?,?)");
		// Change password
		ps3 = cn.prepareStatement("update my_customers set password=? where email=?");
	}

	@Override
	public Customer customerLogin(String email, String password) throws SQLException {
		ps1.setString(1, email);
		ps1.setString(2, password);
		try (ResultSet rs = ps1.executeQuery()) {
			if (rs.next()) {
				return new Customer(rs.getInt(1), rs.getDouble(2), email, rs.getString(4), rs.getDate(5), password,
						rs.getString(7));
			}
		}
		return null;
	}

	@Override
	public String customerRegistration(Customer cust) throws SQLException {
		ps2.setDouble(1, cust.getDepositAmt());
		ps2.setString(2, cust.getEmailId());
		ps2.setString(3, cust.getCustName());
		ps2.setString(4, cust.getPassword());
		ps2.setDate(5, cust.getRegDate());
		ps2.setString(6, cust.getRole());
		int updateCnt = ps2.executeUpdate();
		if (updateCnt == 1) {
			return "Customer registration done successfully...";
		}
		return "Customer registration failed...!!!";
	}

	@Override
	public String changePassword(String email, String oldPassword, String newPassword) throws SQLException {
		ps3.setString(1, newPassword);
		ps3.setString(2, email);
		int updateCnt = ps3.executeUpdate();
		if (updateCnt == 1) {
			return "Password change successfully...";
		}
		return "Password change failed...!!!";
	}

	public void closeConnection() throws SQLException {
		if (ps1 != null)
			ps1.close();
		if (ps2 != null)
			ps2.close();
		if (ps3 != null)
			ps3.close();
		System.out.println("Customer dao cleaned up....");
	}

}
