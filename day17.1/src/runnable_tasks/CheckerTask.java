package runnable_tasks;

import static java.lang.Thread.*;

import utils.JointAccount;

public class CheckerTask implements Runnable {
	private JointAccount account;

	public CheckerTask(JointAccount account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName() + " strted");
		try {
			boolean exit = false;
			while (!exit) {
				double balance = account.checkBalance();
				System.out.println("curnt balance " + balance);
				if (balance != 5000) {
					System.out.println("ERROR!!!!!!!!!!!!");
					// terminate java app
					System.exit(1);
				}
				sleep(237);
			}
		} catch (Exception e) {
			System.out.println(currentThread().getName() + " err " + e);
		}
		System.out.println(currentThread().getName() + " over");
	}

}
