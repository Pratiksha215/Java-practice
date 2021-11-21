package tester;

import java.io.IOException;

import utils.SynchroUtils;

public class Test6 {
	private static boolean exit;

	public static void main(String[] args) throws IOException, InterruptedException {
		// single copy of a shared resource
		SynchroUtils resource = new SynchroUtils();
		// new Runnable() => instance of class which imple Runnable : Test1$1
		Thread t1 = new Thread(()->{
				// ano inner class can't access any method local var : which is not either final
				// effectively final(i.e not changing the value)
				while (!exit)
					resource.test();// t1 has to acquire the lock : synched

			
		}, "t1");
		// new Runnable() => instance of class which imple Runnable : Test1$2
		Thread t2 = new Thread(()-> {

			
				while (!exit)
					synchronized (resource) {
						resource.testMeAgain();// testMeAgain : method is NOT inherently thrd safe(i.e it's not
												// synchronized) BUT invoking it from within synched block ensures thrd safety
					}

			
		}, "t2");
		t1.start();
		t2.start();// 3 runnable : main , t1, t2
		System.out.println("Press enter to stop the app");
		System.in.read();// till user supplies at least 1 byte of data : main : state : blocked on i/o
		exit = true;
		System.out.println("main waiting for child thrds to finish exec");
		t1.join();
		t2.join();
		System.out.println("main over.....");

	}

}
