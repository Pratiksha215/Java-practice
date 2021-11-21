package thrds1;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		// display details of the main thread : name , priority , thrd grp
		System.out.println("main thrd's dtls " + Thread.currentThread());
		// create instance of a class that imple Runnable
		RunnableTask task = new RunnableTask();//1 : main
		//create named Threads(constr) n start the same
		Thread t1=new Thread(task, "one");
		Thread t2=new Thread(task, "two");
		Thread t3=new Thread(task, "three");//NEW : RUNNABLE --1 : main
		t1.start();
		t2.start();
		t3.start();//4 threads : RUNNABLE
		
		System.out.println("Main's B.L");
	//	t2.start();//IllegalThreadStateExc
		System.out.println("Alive "+t1.isAlive()+" "+t2.isAlive()+" "+t3.isAlive());//true
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " exec # " + i);
			// sleep : for real world testing : it simulates practical delays n to force ctx
			// switching
			Thread.sleep(1000);
		}
	//	t1.start();//IllegalThreadStateExc
		System.out.println("Alive "+t1.isAlive()+" "+t2.isAlive()+" "+t3.isAlive());//false
		System.out.println("main over....");
	}

}
