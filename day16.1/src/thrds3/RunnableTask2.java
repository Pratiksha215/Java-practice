package thrds3;

import static java.lang.Thread.*;

//current Thread  : t2 : run : run indefinitely : with intermediate sleep
public class RunnableTask2 implements Runnable {

	@Override
	public void run() {
		// thrd name strted
		System.out.println(currentThread().getName() + " strted ");
		try {
			System.out.println(currentThread().getName() + " executing some B.L......");
			int counter = 0;
			boolean exit = false;
			while (!exit) {
				System.out.println(currentThread().getName() + " exec # " + (counter++));
				sleep(500);
			}
			System.out.println("loop over in "+currentThread().getName());
		} catch (Exception e) {
			System.out.println("err in thrd " + currentThread().getName() + " exc " + e);
		}

		System.out.println(currentThread().getName() + " over ");

	}

}
