package tester;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.banking.AcType;
import com.banking.BankAccount;

import custom_excs.AccountHandlingException;
import static utils.AccountValidationRules.*;

public class TestAccounts {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			// create suitable array to store account details
			System.out.println("Enter how many max no of accounts?");
			BankAccount[] accounts = new BankAccount[sc.nextInt()];// 100
			boolean exit = false;
			int counter = 0;
			while (!exit) {
				try {
					System.out.println("Menu 1.Create New A/C 2.Display 3.Link KYC 4.Withdraw 10.Exit");
					System.out.println("Choose Option");
					switch (sc.nextInt()) {
					case 1:
						if (counter < accounts.length) {
							System.out.println("Enter a/c details : acctNo custName acctType  balance creationDate ");
							// validation rules + a/c instance
							BankAccount a = new BankAccount(sc.nextInt(), validateName(sc.next()),
									parseNValidateAccountType(sc.next().toUpperCase()),
									validateBalance(sc.nextDouble()), validateDate(sc.next()));
							accounts[counter++] = a;
							System.out.println("A/C created successfully!!!!!");

						} else
							throw new AccountHandlingException("Max Accounts reached!!!");
						break;
					case 2:
						System.out.println("Display all a/c details");
						for (BankAccount a : accounts)
							if (a != null)
								System.out.println(a);// BankAccount cls's toString

						break;
					case 3:// link KYC details i/p acct no n KYC details
						System.out.println("Enter acct no");
						int acctNo = sc.nextInt();
						// write a method to validate bank account no
						// failure : throw exc
						// found : rets validated bank acct ref.
						// check if acct exists
						BankAccount bankAccount = validateAccountNo(acctNo, accounts);
						// a/c exists
						System.out.println("Enter KYC details : email address  phoneNo");
						bankAccount.linkKYC(sc.next(), sc.next(), sc.next());
						System.out.println("KYC linked.....");
						break;
					case 4: // withdraw
						// i/p : acct no , withdrawl amount
						System.out.println("Enter a/c no & amount to withdraw");
						acctNo = sc.nextInt();
						double amount=sc.nextDouble();
						// acct no validation : for-each /for --doesn't exist : throw exc
						bankAccount = validateAccountNo(acctNo, accounts);
						//acct no exists
						// if it's linked to KYC : allow tx --o.w throw exc.
						bankAccount.withdraw(amount);
						System.out.println("Hello ,"+bankAccount.getCustName()+" Withdrawl successful");
						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println("Error " + e);
					System.out.println("Pls retry");
				}
				// to clear off pending tokens from buffer of a scanner
				sc.nextLine();
			}
		}

	}

}
