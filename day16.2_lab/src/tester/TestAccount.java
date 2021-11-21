package tester;

import java.util.Scanner;

import threads.CheckTask;
import threads.UpdateTask;
import utils.JointAccount;

public class TestAccount
{

	public static void main(String[] args) throws InterruptedException
	{
		try(Scanner sc=new Scanner(System.in))
		{
			JointAccount ja=new JointAccount(5000);
			Thread cust1=new Thread(new UpdateTask(ja,5000,"update"));
			Thread cust2=new Thread(new CheckTask(ja,5000,"update"));
			System.out.println("Main started");
			cust1.start();
			cust2.start();
			System.out.println("Main waitsn till both tasks are done");
			cust1.join();
			cust2.join();
			
		}
		
		System.out.println("Main Over");

	}

}
