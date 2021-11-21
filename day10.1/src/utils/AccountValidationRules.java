package utils;

import static java.time.LocalDate.of;
import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.ArrayList;

import com.banking.AcType;
import com.banking.BankAccount;

import custom_excs.AccountHandlingException;

public class AccountValidationRules {
	// constant
	public static final double MIN_BALANCE;
	public static final int MIN_LENGTH;
	public static final int MAX_LENGTH;

	public static LocalDate beginDate, endDate;

	static {
		MIN_BALANCE = 1000;
		MIN_LENGTH = 4;
		MAX_LENGTH = 10;

		beginDate = of(2020, 4, 1);
		endDate = of(2021, 3, 31);

	}

//add a static method to validate balance : Min balance for any type of a/c =1000
	public static double validateBalance(double balance) throws AccountHandlingException {

		if (balance < MIN_BALANCE)
			throw new AccountHandlingException("A/C overdrawn : insufficient funds!!!!");
		// success
		return balance;

	}

	// add a static method to parse acct type from string --->enum
	public static AcType parseNValidateAccountType(String acctType) {
		return AcType.valueOf(acctType);// parsing + validation
		// (It will throw java.lang.IllegalArgumentException in case of
		// invalid a/c type
	}

	// add a static method for validating customer name
	public static String validateName(String name) throws AccountHandlingException {
		if (name.length() < MIN_LENGTH || name.length() > MAX_LENGTH)
			throw new AccountHandlingException("Invalid customer name!!!!");
		return name;// rets validated customer to the caller
	}

	// add a static method to parse n validate a/c creation date.
	public static LocalDate validateDate(String date) throws AccountHandlingException {
		// parsing
		LocalDate creationDate = parse(date);
		// parsing successful
		if (creationDate.isBefore(beginDate) || creationDate.isAfter(endDate))
			throw new AccountHandlingException("Invalid date!!!!!");
		// validation successful
		return creationDate;

	}

	// write a method to validate bank account no
	// failure : throw exc
	// found : rets validated bank acct ref.
	public static BankAccount validateAccountNo(int acNo, ArrayList<BankAccount> list) throws AccountHandlingException {
		int index = list.indexOf(new BankAccount(acNo));
		if (index == -1)
			throw new AccountHandlingException("A/C no invalid !!!!!!!");
		return list.get(index);

	}

}
