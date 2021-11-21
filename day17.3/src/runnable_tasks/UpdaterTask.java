package runnable_tasks;

import static java.lang.Thread.*;

import utils.JointAccount;

public class UpdaterTask implements Runnable {
	private JointAccount account;

	public UpdaterTask(JointAccount account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName() + " strted");
		try {
			boolean exit=false;
			while(!exit)
			{
				synchronized (account) {
					account.updateBalance(500);
					
				}
				sleep(123);
				
			}
		} catch (Exception e) {
			System.out.println(currentThread().getName() + " err " + e);
		}
		System.out.println(currentThread().getName() + " over");
	}

}
