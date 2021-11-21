package utils;

import static java.lang.Thread.*;

public class JointAccount {
	private double balance;

	public JointAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}

	// update balance
	public synchronized void updateBalance(double amt) throws Exception {
		System.out.println("Updating bal : " + currentThread().getName());
		balance = balance + amt;
		System.out.println("Cancelling updates, after a dly");//cust1 --> rdy pool
	Thread.sleep(20);//cust1 : state : Blocked on sleep : release the Processor BUT it should not release the lock
		balance = balance - amt;
		System.out.println("Updations over by " + currentThread().getName());
	}

	// chk balance
	public  synchronized double checkBalance() throws Exception {
		System.out.println("Checking balance : by "+ currentThread().getName());//cust2 : 5500
		Thread.sleep(37);
		return balance;

	}

}
