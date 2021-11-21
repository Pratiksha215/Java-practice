package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.banking.AcType;
import com.banking.BankAccount;

import custom_excs.AccountHandlingException;

public class AccountValidationRules {
	// constant
	public static final double MIN_BALANCE;
	public static final int MIN_LENGTH;
	public static final int MAX_LENGTH;
	public static SimpleDateFormat sdf;
	public static Date beginDate, endDate;

	static {
		MIN_BALANCE = 1000;
		MIN_LENGTH = 4;
		MAX_LENGTH = 10;
		sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			beginDate = sdf.parse("1-4-2020");
			endDate = sdf.parse("31-3-2021");
		} catch (ParseException e) {
			System.out.println("Error in static init block " + e);
		}

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
	public static Date validateDate(String date) throws ParseException, AccountHandlingException {
		// parsing
		Date creationDate = sdf.parse(date);
		// parsing successful
		if (creationDate.before(beginDate) || creationDate.after(endDate))
			throw new AccountHandlingException("Invalid date!!!!!");
		// validation successful
		return creationDate;

	}
	//write a method to validate bank account no
	//failure : throw exc
	//found : rets validated bank acct ref.
	public static BankAccount validateAccountNo(int acNo,BankAccount[] accts) throws AccountHandlingException
	{
		for(BankAccount a : accts)
			if(a != null && a.getAcctNo()==acNo)
				return a;//rets validated bank a/c ref.
		//a/c not found
		throw new AccountHandlingException("A/C no invalid !!!!!!!");
		
	}

}
