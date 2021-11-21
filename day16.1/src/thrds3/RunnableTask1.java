package thrds3;
import static java.lang.Thread.*;
//current Thread  : t1 : run : t2.join()
public class RunnableTask1 implements Runnable {
	private Thread t2;
	public RunnableTask1(Thread t2) {
		super();
		this.t2 = t2;
	}


	@Override
	public void run() {
		// thrd name strted
		System.out.println(currentThread().getName() + " strted ");
		try {
			System.out.println(currentThread().getName()+" executing some B.L......");
			//t1 MUST wait for t2 to finish exec
			t2.join();

		} catch (Exception e) {
			System.out.println("err in thrd " + currentThread().getName() + " exc " + e);
		}

		System.out.println(currentThread().getName() + " over ");

	}

}
