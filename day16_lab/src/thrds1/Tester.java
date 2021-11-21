package thrds1;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter strt n end of range");
			int strt = sc.nextInt();
			int end = sc.nextInt();
			// creating thrds
			EvenPrinterThread t1 = new EvenPrinterThread(strt, end, "even");
			OddPrinterThread t2 = new OddPrinterThread(strt, end, "odd");
			System.out.println("main waiting for child thrds to complete exc");
			t1.join();
			t2.join();
			System.out.println("main over....");

		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " err " + e);
		}

	}

}
