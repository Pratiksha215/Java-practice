package tester;

import runnable_tasks.CheckerTask;
import runnable_tasks.UpdaterTask;
import utils.JointAccount;

public class TestSharedResources {

	public static void main(String[] args) throws InterruptedException {
		// create single joint a/c
		JointAccount acct = new JointAccount(5000);
		// create tasks , attach them to thrds(Thread(Runnable instance,String name) ,
		// start them
		Thread t1 = new Thread(new UpdaterTask(acct), "cust1");// customer #1 updating balance of joint a/c
		Thread t2 = new Thread(new CheckerTask(acct), "cust2");// customer # 2 checking bal of the SAME joint a/c
		t1.start();
		t2.start();// 3 Runnable thrds
		System.out.println("Main waiting for child thrds to complete exec");
		t1.join();//main thrd is blocked on join : t1 over 
		t2.join();//
		System.out.println("main over...");
	}

}
