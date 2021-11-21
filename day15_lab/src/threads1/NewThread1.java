package threads1;

public class NewThread1 extends Thread 
{
	//ad para constr
	public NewThread1(String name)
	{
		super(name);//STATE:new thread
		start();//STATE:Runnable(run or ready to run)
	}
	
	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getName()+"Started");
		//B.l::basic for loop for today	
		try 
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(Thread.currentThread().getName()+"exec # "+i);
				//sleep:: for understanding practical delays & to force context switching
				//Wrap entire BL with try catch
			
				Thread.sleep(500);
			} 

		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"Over");
	}
}
