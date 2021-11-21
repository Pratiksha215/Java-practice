package threads;

import utils.JointAccount;

public class CheckTask implements Runnable
{
	private JointAccount ja;
	private int amt;
	

	public CheckTask(JointAccount ja,int amt,String name) 
	{
		
		this.ja = ja;
	}
	
	@Override
	public void run() 
	{
		try 
		{
			boolean exit=false;
			System.out.println(Thread.currentThread().getName()+"Started");
			while(!exit)
			System.out.println("Balance"+ja.checkBalance());
		}
		catch(Exception err)
		{
			System.out.println("Error:: "+err.getStackTrace());
		}
		
		System.out.println(Thread.currentThread().getName()+"Over");
	}
	

}
