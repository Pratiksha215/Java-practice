package threads;
import utils.*;
public class UpdateTask implements Runnable
{
	private JointAccount ja;
	private int amt;
	

	public UpdateTask(JointAccount ja,int amt,String name) 
	{
		
		this.ja = ja;
	}
	
	@Override
	public void run() 
	{
		try 
		{
			System.out.println(Thread.currentThread().getName()+"Started");

			ja.updateBalance(amt);
			System.out.println("Balance:: "+ja);
		}
		catch(Exception err)
		{
			System.out.println("Error:: "+err.getStackTrace());
		}
		
		System.out.println(Thread.currentThread().getName()+"Over");
	}
	
	
}
