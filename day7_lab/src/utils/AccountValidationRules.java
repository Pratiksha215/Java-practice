package utils;

import com.banking.AcType;

import custom_excs.AccountHandlingException;

public class AccountValidationRules {
	// constant
	public static final double MIN_BALANCE;
	static {
		MIN_BALANCE = 1000;
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
		//(It will throw IllegalArgumentException in case of
										// invalid a/c type
	}

}
