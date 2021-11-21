package q4.tester;

import java.util.Scanner;

import q4.com.app.stack.Employee;
import q4.com.app.stack.FixedStack;
import q4.com.app.stack.GrowableStack;
import q4.com.app.stack.Stack;
import q4.custom_excs.StackHandlingException;

public class TestStack {

	public static void main(String[] args) throws StackHandlingException {

		try (Scanner sc = new Scanner(System.in)) {

			Stack stackRef = null;
			boolean exit = false;

			while (!exit) {
				System.out.println("\n===Menu===\n1. Fixed Stack\n" + "2. Growable Stack\n" + "3. Push Data\n"
						+ "4. Pop Dta\n" + "5. Display Stack\n" + "6. Exit\n");
				System.out.println("Choose Option");
				try {
					switch (sc.next()) {
					case "1":
						if (stackRef != null)
							throw new StackHandlingException(
									"Stack type already selected to= " + stackRef.getClass().getName());
						stackRef = new FixedStack();
						break;

					case "2":
						if (stackRef != null)
							throw new StackHandlingException(
									"Stack type already selected to= " + stackRef.getClass().getName());
						stackRef = new GrowableStack();
						break;

					case "3":
						if (stackRef == null)
							throw new StackHandlingException("At First, select the stack type.");
						System.out.println("Enter Managers Details: ID, Name");
						stackRef.push(new Employee(sc.nextInt(), sc.next() + " " + sc.next()));
						break;

					case "4":
						if (stackRef == null)
							throw new StackHandlingException("At First, select the stack type.");
						stackRef.pop();

						break;

					case "5":
						if (stackRef == null)
							throw new StackHandlingException("At First, select the stack type.");
						stackRef.toString();
						break;

					case "6":
						exit = true;
						break;

					default:
						System.out.println("Enter the correct choice");
					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
