package com.customer;

import java.time.LocalDate;

public class Customer {
	
	private String custName;
	private String email;
	private String password;
	private LocalDate dateOfBirth;
	private CustType custType;
	private double regAmount;

	public String getCustName() {
		return custName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public CustType getCustType() {
		return custType;
	}

	public double getRegAmount() {
		return regAmount;
	}

	public Customer(String custName, String email, String password, LocalDate dateOfBirth, CustType custType,
			double regAmount) {
		super();
		this.custName = custName;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.custType = custType;
		this.regAmount = regAmount;
	}

	public Customer(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", email=" + email + ", password=" + password + ", dateOfBirth="
				+ dateOfBirth + ", custType=" + custType + ", regAmount=" + regAmount + "]";
	}

	

}
