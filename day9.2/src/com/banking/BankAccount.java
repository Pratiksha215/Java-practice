package com.banking;
//acct no(int),customer name(string), acct type(enum),balance(double),creationDate(java.util.Date)

import java.time.LocalDate;

import custom_excs.AccountHandlingException;
import static utils.AccountValidationRules.validateBalance;

public class BankAccount implements Comparable<BankAccount> {
	private int acctNo;
	private String custName;
	private AcType acctType;
	private double balance;
	private LocalDate creationDate;
	// For HAS-A relationship(composition) add a reference of KYC
	private KYC customerInfo;

	public BankAccount(int acctNo, String custName, AcType acctType, double balance, LocalDate creationDate) {
		super();
		this.acctNo = acctNo;
		this.custName = custName;
		this.acctType = acctType;
		this.balance = balance;
		this.creationDate = creationDate;
	}

	// create overloaded constr to encapsulate PK fields
	public BankAccount(int acctNo) {
		super();
		this.acctNo = acctNo;
	}

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", custName=" + custName + ", acctType=" + acctType + ", balance="
				+ balance + ", created on " + creationDate + customerInfo;
	}

	public int getAcctNo() {
		return acctNo;
	}

	public String getCustName() {
		return custName;
	}

	public AcType getAcctType() {
		return acctType;
	}

	// B.L methods
	/*
	 * Methods public void withdraw(double amt) public void deposit(double amt)
	 * public void transferFunds(BankAccount dest,double amt) public void
	 * applyInterest(double rate) --to apply simple interest (yearly) (period=1 yr)
	 */
	// Add a B.L method to withdraw funds
	public void withdraw(double amt) throws AccountHandlingException {
		if (customerInfo == null)
			throw new AccountHandlingException("KYC Not linked yet : NO Txs!!!!!!");
		validateBalance(balance - amt);
		balance -= amt;
	}

	// Add a B.L method to deposit funds
	public void deposit(double amt) {
		balance += amt;
	}

	// Add a B.L method to transfer funds from src a/c ---> dest a/c
	public void transferFunds(BankAccount dest, double amt) throws AccountHandlingException {
		this.withdraw(amt);
		dest.deposit(amt);
	}

	// add a B.L method for applying interest
	public void applyInterest(double interestRate) {
		balance += ((balance * interestRate) / 100);
	}

	// add a method to link KYC details for an a/c
	public void linkKYC(String email, String address, String phoneNo) {
		customerInfo = new KYC(email, address, phoneNo);
	}

	// override equals method in BankAccount class based upon PK (acctNo) to replace
	// ref equality by content equality
	@Override
	public boolean equals(Object o) {
		System.out.println("in bank acct equals");
		if (o instanceof BankAccount) {
			return this.acctNo == ((BankAccount) o).acctNo;
		}
		return false;
	}

	// implement compareTo method inherited from Comparable<T> i/f to supply Natural
	// orderin g criteria
	@Override
	public int compareTo(BankAccount anotherAcct)// BankAccount
	{
		System.out.println("in bank acct : compareTo: acct no");

		if (this.acctNo < anotherAcct.acctNo)
			return -1;
		if (this.acctNo == anotherAcct.acctNo)
			return 0;
		return 1;

		/*
		 * if (this.balance < anotherAcct.balance) return 1; if (this.balance ==
		 * anotherAcct.balance) return 0; return -1;
		 */

	}

	// embed KYC details within enclosing BankAccount class
	private class KYC {
		private String email, address, phoneNo;

		public KYC(String email, String address, String phoneNo) {
			super();
			this.email = email;
			this.address = address;
			this.phoneNo = phoneNo;
		}

		@Override
		public String toString() {
			return "KYC Details " + email + ", address=" + address + ", phoneNo=" + phoneNo;
		}

	}

}
