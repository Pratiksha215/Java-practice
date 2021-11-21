package utils;

import static java.time.LocalDate.of;
import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

import com.customer.Customer;
import com.customer.custType;

import custom_excs.CustomerHandlingException;

public class ValidationRules {
	public static String email;
	public static final LocalDate beginDate;
	static {
		email = "pratiksha@gmail.com";
		beginDate = of(2020, 01, 01);
	}

	// String class methods
	public static String validateEmail(String email) throws CustomerHandlingException {
		if (email.contains("@") && email.endsWith(".com")) {
			return email;
		} else
			throw new CustomerHandlingException("Invalid Email...!!");
	}
	//

	public static Customer validateEmail(String emailId, Map<String, Customer> map) throws CustomerHandlingException {
		Customer c = map.get(emailId);
		if (email.contains("@") && email.endsWith(".com") && c != null)
			return c;
		else
			throw new CustomerHandlingException("Invalid Email..!!");

	}

	public static void validatePassword(String email, String pass, Map<String, Customer> map)
			throws CustomerHandlingException {
		Customer c = validateEmail(email, map);
		if (c == null)
			throw new CustomerHandlingException("Invalid Email..!!");
		else if (c.getPassword().equals(pass))
			System.out.println("Login Succesful");
		else
			throw new CustomerHandlingException("Invalid Password..!!");
	}

	public static void validatePassword(String email, String pass, String newPass, Map<String, Customer> map)
			throws CustomerHandlingException {
		Customer c = validateEmail(email, map);
		if (c == null)
			throw new CustomerHandlingException("Invalid Email..!!");
		else if (c.getPassword().equals(pass))
			c.setPassword(newPass);
		else
			throw new CustomerHandlingException("Invalid Password..!!");
	}
	// add a static method to parse custType from string
	public static custType parseValidateCustType(String customerType) {
		return custType.valueOf(customerType);
	}

	// create a validation for date of birth
	public static LocalDate validateDate(String Date) throws CustomerHandlingException {
		LocalDate dateOfBirth = parse(Date);
		if (dateOfBirth.isAfter(beginDate)) {
			throw new CustomerHandlingException("Invalid Date Of Birth..!!");
		}
		return dateOfBirth;
	}

}
