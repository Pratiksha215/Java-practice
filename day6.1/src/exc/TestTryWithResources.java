package exc;

import java.util.Scanner;

public class TestTryWithResources {

	public static void main(String[] args) {
		//try-with-resources : AutoCloseable
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your name");
			System.out.println("Hello " + sc.nextLine());
			System.out.println("Enter age");
			System.out.println("Age " + sc.nextInt());
			System.out.println("end of try with resources");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("main over");

	}

}
