package tester;

import java.sql.Date;
import java.util.Scanner;

import dao.CustomerDao;
import pojos.Customer;

public class TestDBLayeredCRUDApp {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			CustomerDao dao = new CustomerDao();
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"====Menu==== \n 1.User Login \n 2.New User registration \n" + " 3.Change password \n 10.Exit");
				System.out.println("Choose Menu : ");

				switch (sc.nextInt()) {
				// User Login
				case 1:
					System.out.println("Enter username and password : ");
					Customer c = dao.customerLogin(sc.next(), sc.next());
					if (c != null) {
						System.out.println(c);
					} else
						System.out.println("Invalid username and password...!!!");
					break;

				// New User registration
				case 2:
					System.out.println("Enter Customer Details : depositAmt emailId custName regDate password role");
					System.out.println(dao.customerRegistration(new Customer(sc.nextDouble(), sc.next(), sc.next(),
							Date.valueOf(sc.next()), sc.next(), sc.next())));
					break;

				// Change password
				case 3:
					System.out.println("Enter emailID oldPassword newPassword :");
					System.out.println(dao.changePassword(sc.next(), sc.next(), sc.next()));
					break;

				case 10:
					exit = true;
					dao.closeConnection();
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
