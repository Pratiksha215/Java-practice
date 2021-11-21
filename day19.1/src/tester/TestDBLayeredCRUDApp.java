package tester;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import dao.EmployeeDaoImpl;
import pojos.Employee;

public class TestDBLayeredCRUDApp {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// DAO inst
			EmployeeDaoImpl dao = new EmployeeDaoImpl();
			boolean exit = false;
			while (!exit) {
				System.out.println("Menu 1. Fetch Details 2. Get Emp details by emp id \n"
						+ "3. Insert emp rec 4 : Update 5. Delete 10.Exit");
				System.out.println("Enter option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter join date(yr-mon-day) , lower n upper sal limits");
						List<Employee> empList = dao.fetchEmpDetails(sc.next(), sc.nextDouble(), sc.nextDouble());
						empList.forEach(System.out::println);
						break;
					case 2:
						System.out.println("Enter emp id");
						System.out.println(dao.fetchEmpDetailsById(sc.nextInt()));
						break;
					case 3:
						System.out.println("Enter emp details for hiring : nm adr sal dept join_date(yr-mon-day)");
						System.out.println(dao.insertEmpDetail(new Employee(sc.next(), sc.next(), sc.nextDouble(),
								sc.next(), Date.valueOf(sc.next()))));
						break;
					case 4: System.out.println("Enter sal incr , new dept id , emp id");
					    System.out.println(dao.updateEmpDetails(sc.nextDouble(), sc.next(), sc.nextInt()));
						break;
					case 5: System.out.println("Enter emp id to delete info");
				    System.out.println(dao.deleteEmpDetails(sc.nextInt()));
					break;
					case 10:
						exit = true;// terminate app -- before
						dao.cleanUp();
						break;
					}
				} catch (Exception e) {
					System.out.println("Error " + e);
					System.out.println("Pls retry....");
				}
				sc.nextLine();// to clear sc's buffer till new line
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
