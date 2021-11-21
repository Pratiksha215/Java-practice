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
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try (Scanner sc = new Scanner(System.in)) {
			// create suitable array to store account details
			System.out.println("Enter how many max no of accounts?");
			BankAccount[] accounts = new BankAccount[sc.nextInt()];// 100
			boolean exit = false;
			int counter = 0;
			while (!exit) {
				try {
					System.out.println("Menu 1.Create New A/C 2.Display 3.Exit");
					System.out.println("Choose Option");
					switch (sc.nextInt()) {
					case 1:
						if (counter < accounts.length) {
							System.out.println("Enter a/c details : acctNo custName acctType  balance creationDate ");
							// validation rules + a/c instance
							BankAccount a = new BankAccount(sc.nextInt(), sc.next(),
									parseNValidateAccountType(sc.next()), validateBalance(sc.nextDouble()),
									sdf.parse(sc.next()));
							accounts[counter++]=a;
							System.out.println("A/C created successfully!!!!!");

						} else
							throw new AccountHandlingException("Max Accounts reached!!!");
						break;
					case 2:

						break;

					case 3:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println("Error " + e);
					System.out.println("Pls retry");
				}
			}
		}

	}

}
