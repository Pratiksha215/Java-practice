package dao;

import java.sql.SQLException;

import pojos.Customer;

public interface ICustomerDao {
	// user login
	Customer customerLogin(String email, String password) throws SQLException;

	// New User registration
	String customerRegistration(Customer cust) throws SQLException;

	// Change password
	String changePassword(String email, String oldPassword, String newPassword) throws SQLException;
}
