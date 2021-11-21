package threads1;

public class TestThread1 {

	public static void main(String[] args) throws InterruptedException 
	{
		//display the details of thread ::name,priority and grp
		
		System.out.println("Main Threads Details"+Thread.currentThread());
		//Create child thread
		NewThread1 t1=new NewThread1("one");
		NewThread1 t2=new NewThread1("two");
		NewThread1 t3=new NewThread1("three");
		NewThread1 t4=new NewThread1("four");      
		System.out.println("Mains B.l");
		//t2.start();   //Illegal ThreadsException   
		t1.run();
		System.out.println("Alive: "+t1.isAlive()+" "+t2.isAlive()+" "+t3.isAlive()+" "+t4.isAlive());
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+"exec # "+i);
			//sleep:: for understanding practical delays & to force context switching
			//Wrap entire BL with try catch
		
			Thread.sleep(100);
		} 
		System.out.println("Alive: "+t1.isAlive()+" "+t2.isAlive()+" "+t3.isAlive()+" "+t4.isAlive());
		//t1.start(); //Illegal ThreadsException 
		System.out.println("Main Over");
	}


}
