package q2.tester;

import java.util.Scanner;
import q2.com.app.org.Employee;
import q2.com.app.org.Manager;
import q2.com.app.org.Worker;

public class TestOrganization {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No. of Employees in Test Organisation");
		Employee[] employees = new Employee[sc.nextInt()];
		boolean exit = false;
		int count = 0;

		while (!exit) {
			System.out.println("\n====Menu==== \n1. Hire Manager\n" + "2. Hire Worker\n" + "3. Display All Employees\n"
					+ "4. Update Manager's Bonus\n" + "5 : Exit : terminate the application.");
			System.out.println("Choose Option");
			switch (sc.nextInt()) {
			case 1:
				
				if (count < employees.length) {
					
					System.out.println("Enter Managers Details: ID, Name, DeptID, Basic, PerfBonus");
					employees[count++] = new Manager(sc.nextInt(), sc.next()+" "+sc.next(), sc.nextInt(), sc.nextDouble(),
							sc.nextDouble());
					System.out.println("Manager Hired");
				} else {
					System.out.println("Hiring season has got over. Try Next time!");
				}
				
				break;

			case 2:
				
				if (count < employees.length) {
					System.out.println("Enter Workers Details: ID, Name, DeptID, Basic, HoursWorked, HourlyRate ");
					employees[count++] = new Worker(sc.nextInt(), sc.next()+" "+sc.next(), sc.nextInt(), sc.nextDouble(),
							sc.nextDouble(), sc.nextDouble());
					System.out.println("Worker Hired");
				} else {
					System.out.println("Hiring season has got over. Try Next time!");
				}
				
				break;

			case 3:
				System.out.println("Displaying All the Employees in Organisation");
				for (Employee e : employees) {
					if (e != null)
						System.out.println(e);
				}
				break;

			case 4:
				System.out.println("Enter the ID of Manager");
				int id = sc.nextInt();
				boolean flag = false;
				for (Employee e : employees) {
					if (e != null && e.getId() == id && e instanceof Manager) {
						System.out.println("Enter the Bonus Increment Amount");
						((Manager) e).setPerfBonus(((Manager) e).getPerfBonus() + sc.nextDouble());
						System.out.println("Updated Manager's Details:\n" + e);
						flag = true;
					}
				}
				if (!flag)
					System.out.println("Employee with the ID=" + id + " is not a Manager or not Found!");

				break;

			case 5:
				exit = true;
				break;
			}
		}
		sc.close();
	}
}
