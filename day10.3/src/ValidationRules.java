package utils;

import static java.time.LocalDate.parse;
import java.time.LocalDate;

import com.car.Company;

public class ValidationRules {

	
	public static LocalDate validateDate(String date) {
		
		LocalDate manufactureDate = parse(date);
		return manufactureDate;
	}
	
public static Company validateParseCompany(String company) {
		
		return Company.valueOf(company);
	}
	
}
