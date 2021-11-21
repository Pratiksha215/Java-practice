package tester;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import com.customer.Customer;
import com.customer.custType;

import custom_excs.CustomerHandlingException;

import java.util.Scanner;
import static utils.CollectionUtils.populateList;
import static utils.CollectionUtils.populateMap;
import static utils.ValidationRules.*;
import static com.customer.custType.*;

public class NewCustomerRegistration {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create a suitable DS to store customer details
			Map<String, Customer> cust = populateMap(populateList());
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println(
							"MENU \n1.New Customer Register\n2.Dispaly all Customer Details\n3.Login Details\n4.Change Password\n5.Discount10.Exit");
					System.out.println("Choose your option :");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("In customer registration...");
						System.out.println(
								"Enter customer details: Name Password EmailID DateOfBirth RegAmount CustonerType");
						Customer c = new Customer(sc.next(), sc.next(), validateEmail(sc.next()),
								validateDate(sc.next()), sc.nextDouble(),
								parseValidateCustType(sc.next().toUpperCase()));
						Customer ref = cust.putIfAbsent(c.getEmail(), c);
						if (ref != null)
							throw new CustomerHandlingException("Duplicate email address..!!");
						System.out.println("Customer registraion completed Successfully..!!");
						break;

					case 2:
						System.out.println("Details of the customer : ");
						for (Customer c1 : cust.values())// Collections<Customer>
							if (c1 != null)
								System.out.println(c1);// Customer toString
						break;
					case 3:
						System.out.println("Login Details : ");
						System.out.println("Enter Email ID:& Password : ");
						// email=validateEmail(sc.next());
						// Customer mail=validateEmail(sc.next(), cust);

						validatePassword(sc.next(), sc.next(), cust);
						// System.out.println("Login succesful");

						break;

					case 4:
						System.out.println("Change Password : ");
						System.out.println("Enter EmailId , Password ,NewPassword : ");
						validatePassword(sc.next(), sc.next(), sc.next(), cust);
						break;
					case 5:
						System.out.println("Age & Registered Amount :");
						for (Customer ca : cust.values()) {
							Period period = Period.between(ca.getDateOfBirth(), LocalDate.now());
							if (period.getYears() > 60)
								ca.setRegAmount(ca.getRegAmount() - 0.1 * ca.getRegAmount());
						}
						System.out.println("Discount Applied...!!");
						break;

					case 10:
						exit = true;
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Please Retry..!!");
				}
				sc.nextLine();
			}

		}

	}

}