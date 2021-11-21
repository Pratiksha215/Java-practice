package thrds4;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		// create n start child thrds
		//t2 
		Thread ref2=new Thread(new RunnableTask2(),"t2");//t2 : NEW
		//t1
		//Thread(Runnable instance,String name)
		Thread ref1=new Thread(new RunnableTask1(ref2), "t1"); //t1 : NEW
		ref2.start();
		ref1.start();//3 runnable
		System.out.println("Main waiting for child thrds till time out....");
		ref1.join(3000);//main waiting for t1 to complete exec : max for 3sec
		ref2.join(2000);//main waiting for t2 to complete exec : max for 2 sec
		System.out.println("Thrd's status after tmout "+ref1.isAlive()+" "+ref2.isAlive());
		System.out.println("main sending interrupt signal to t2 thrd");
		ref2.interrupt();
		System.out.println("Main waiting for child thrds indefinitely to finish exec w/o tmout");
		ref1.join();
		ref2.join();
		System.out.println("Thrd's status after join "+ref1.isAlive()+" "+ref2.isAlive());
		System.out.println("Main over.....");
		

	}

}
