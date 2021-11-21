package thrds3;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		// create n start child thrds
		//t2 
		Thread ref2=new Thread(new RunnableTask2(),"t2");//t2 : NEW
		//t1
		Thread ref1=new Thread(new RunnableTask1(ref2), "t1"); //t1 : NEW
		ref2.start();
		ref1.start();//3 runnable
		System.out.println("Main waiting for child thrds....");
		ref1.join();//main waiting for t1 to complete exec
		ref2.join();//main waiting for t2 to complete exec
		System.out.println("Main over.....");
		

	}

}
