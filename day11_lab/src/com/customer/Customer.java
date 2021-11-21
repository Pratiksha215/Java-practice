package com.customer;

import java.time.LocalDate;
import custom_excs.CustomerHandlingException;

public class Customer {
	private String custName;
	private String password, email;
	private LocalDate dateOfBirth;
	private Double regAmount;
	private custType customerType;

	public Customer(String custName, String password, String email, LocalDate dateOfBirth, Double regAmount,
			custType customerType) {
		super();
		this.custName = custName;
		this.password = password;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.regAmount = regAmount;
		this.customerType = customerType;
	}

	// toString
	public String getCustName() {
		return custName;
	}

	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", password=" + password + ", email=" + email + ", dateOfBirth="
				+ dateOfBirth + ", regAmount=" + regAmount + ", customerType=" + customerType + "]";
	}

	// Getters
	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getDateOfBirth() { //
		return dateOfBirth;
	}
	

	public Double getRegAmount() {
		return regAmount;
	}

	public custType getCustomerType() {
		return customerType;
	}
	public Customer LocalDate(int year, int month, int day) {
		return LocalDate(year, month, day);		
	}

	

	// create overload constructor to encapsulate PK fields
	public Customer(String email) {
		super();
		this.email = email;
	}
	//Setter's
	public void setCustName(String custName) {
		this.custName = custName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setRegAmount(Double regAmount) {
		this.regAmount = regAmount;
	}

	public void setCustomerType(custType customerType) {
		this.customerType = customerType;
	}

}
