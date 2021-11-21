package thrds2;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter strt n end of range");
			int strt = sc.nextInt();
			int end = sc.nextInt();
			// creating thrds
			Thread t1=new Thread(new EvenPrinterTask(strt, end), "even");
			Thread t2=new Thread(new OddPrinterTask(strt, end), "odd");
			t1.start();
			t2.start();
			System.out.println("main waiting for child thrds to complete exc");
			t1.join();
			t2.join();
			System.out.println("main over....");

		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " err " + e);
		}

	}

}
