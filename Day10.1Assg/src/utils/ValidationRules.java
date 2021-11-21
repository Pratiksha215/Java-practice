package utils;

import static java.time.LocalDate.parse;

import java.time.LocalDate;

import com.customer.CustType;

import cust_exc.CustomerHandlingException;

public class ValidationRules {

	public static final int MIN_LENGTH;
	public static final int MAX_LENGTH;

	static {
		MIN_LENGTH = 4;
		MAX_LENGTH = 10;
	}

	public static String validateEmail(String email) throws CustomerHandlingException {

		if (email.contains("@") && email.endsWith(".com"))
			return email;
		else
			throw new CustomerHandlingException("Invalid email-id");
	}

	public static String validateName(String name) throws CustomerHandlingException {

		if (name.length() < MIN_LENGTH && name.length() > MAX_LENGTH)
			throw new CustomerHandlingException("Invalid Customer Name :");
		return name;
	}
	
	public static LocalDate validateDate(String date) {
		
		LocalDate regDate = parse(date);
		return regDate;
	}
	
	public static CustType validateParseCustType(String custType) {
		
		return CustType.valueOf(custType);
	}
}
