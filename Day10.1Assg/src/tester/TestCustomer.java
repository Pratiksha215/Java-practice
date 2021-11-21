package tester;

import static utils.ValidationRules.validateDate;
import static utils.ValidationRules.validateEmail;
import static utils.ValidationRules.validateName;
import static utils.ValidationRules.validateParseCustType;
import java.util.ArrayList;
import java.util.Scanner;
import com.customer.Customer;
import cust_exc.CustomerHandlingException;

public class TestCustomer {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			ArrayList<Customer> custList = new ArrayList<>();
			boolean exit = false;

			while (!exit) {
				try {
					System.out.println("====MENU==== \n 1.New Customer registration\n"
							+ " 2.Customer Login \n 3.Display all customer details\n" + " 100.Exit");
					System.out.println("Enter your choice : ");
					int ch = sc.nextInt();

					switch (ch) {

					case 1:
						System.out.println("Enter customer details : custName  email  "
								+ "password  dateOfBirth  custType  regAmount");
						Customer c1 = new Customer(validateName(sc.next()), validateEmail(sc.next()), sc.next(),
								validateDate(sc.next()), validateParseCustType(sc.next().toUpperCase()),
								sc.nextDouble());
						custList.add(c1);
						System.out.println("Customer registration completed");
						break;

					case 2:
						if (custList.isEmpty())
							throw new CustomerHandlingException("Fill registration details first");
						else {
							System.out.println("Enter customer Email-id & Password");
							String email = sc.next();
							String pass = sc.next();
							for (Customer c : custList) {
								if (c.getEmail().equals(email) && c.getPassword().equals(pass)) {
									System.out.println("Customer Login Successfull...!");
									break;
								} else
									throw new CustomerHandlingException("Plz enter valid email-id and password ");
							}
						}
						break;

					case 3:
						if (custList.isEmpty())
							throw new CustomerHandlingException("Fill registration details first");
						else {
							System.out.println("Display All Registration Details are : ");
							for (Customer cust : custList) {
								if (cust != null)
									System.out.println(cust);
							}
						}
						break;

					case 100:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				sc.nextLine();
			}
		}
	}
}
