package tester;

import static com.banking.AcType.SAVING;
import static utils.AccountValidationRules.parseNValidateAccountType;
import static utils.AccountValidationRules.validateAccountNo;
import static utils.AccountValidationRules.validateBalance;
import static utils.AccountValidationRules.validateDate;
import static utils.AccountValidationRules.validateName;
import static utils.CollectionUtils.populateList;
import static utils.CollectionUtils.populateMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

import com.banking.AcType;
import com.banking.BankAccount;

import custom_excs.AccountHandlingException;

public class TestAccountMap {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			// create suitable DS to store account details : HashMap

			Map<Integer, BankAccount> accts = populateMap(populateList());
			boolean exit = false;

			while (!exit) {
				try {
					System.out.println("Menu 1.Create New A/C 2.Display 3. Check for Exists \n"
							+ "4. Fetch A/C Summary 5.Link KYC 6.Apply Interest 7.Phone number of all FD Accno 8.Withdraw funds 9.Funds Transfer 10. Close Account \n" + "100.Exit");
					System.out.println("Choose Option");
					switch (sc.nextInt()) {
					case 1:

						System.out.println(
								"Enter a/c details : acctNo custName acctType  balance creationDate(yr-mon-day) ");
						// validation rules + a/c instance
						BankAccount a = new BankAccount(sc.nextInt(), validateName(sc.next()),
								parseNValidateAccountType(sc.next().toUpperCase()), validateBalance(sc.nextDouble()),
								validateDate(sc.next()));
						// putIfAbsent : to ensure no overwriting of earlier a/c info
						BankAccount ref = accts.putIfAbsent(a.getAcctNo(), a);
						//ref:null=> new entry(inserted in the map) , ref: not null=> existing
						//entry (won't be added in the map)
						if (ref != null)
							throw new AccountHandlingException("Dup acct number !!!!!");
						System.out.println("A/C created successfully!!!!!");

						break;
					case 2:
						System.out.println("Display all a/c details");
                        //can't iterate over the map : limitation
						// System.out.println(accts);//Invokes HM's toString :
						// values(0: Collection<V>
						for (BankAccount a1 : accts.values())// Collection<BankAccount>
							System.out.println(a1);
						break;
					case 3: // 3. Check if acct exists
						// i/p : acct no
						// o/p : present / absent
						System.out.println("Enter acct no");
						int acctNo = sc.nextInt();
						System.out.println(accts.containsKey(acctNo) ? "Present" : "Absent");

						break;
						
					case 4:
						System.out.println("Enter acct no to get a/c summary");
						acctNo = sc.nextInt();
						System.out.println(validateAccountNo(acctNo, accts));//In case of no errs: calls
						//validated bank acct's toString
						break;

					case 5:// link KYC details i/p acct no n KYC details
						System.out.println("Enter acct no");
						acctNo = sc.nextInt();
						// write a method to validate bank account no
						// failure : throw exc
						// found : rets validated bank acct ref.

						BankAccount bankAccount = validateAccountNo(acctNo, accts);
						// a/c exists
						System.out.println("Enter KYC details : email address  phoneNo");
						bankAccount.linkKYC(sc.next(), sc.next(), sc.next());
						System.out.println("KYC linked.....");
						break;
					case 6: // apply interest on saving a/c
						System.out.println("Enter interest rate : for applying the interest");
						double rate = sc.nextDouble();
						// create Enum type of Saving
						// AcType saving=AcType.SAVING;
						// search by ac type --if matched --invoke applyInterest
						// search criteria --- value based
						// Map limitation : can't directly search by val based criteria
						// Map is not iterable : can't attach for-each
						// map ----> values() ---> Collection<BankAccount>
						for (BankAccount a1 : accts.values())// Collection<BankAccount>
							if (a1.getAcctType().equals(AcType.SAVING))
								a1.applyInterest(rate);
						break;
					case 7:// phone no. of all fd accno
						System.out.println(".display phone no of fd ac");
						for (BankAccount a1 : accts.values())// Collection<BankAccount>
							if (a1.getAcctType().equals(AcType.FD))
								a1.getPhoneNo();
						break;
						
					case 8://Withdraw funds
						System.out.println("enter the acc No");
						acctNo=sc.nextInt();
						bankAccount =accts.get(acctNo);
						if(bankAccount==null)
							throw new AccountHandlingException("Invalid A/c No :cant withdraw the amount");
						  bankAccount.withdraw(sc.nextDouble());
						  System.out.println("withdraw successful");
                       break;
						
					case 9:
						 // funds transfer
						System.out.println("Enter src and dest account: ");
						BankAccount src = validateAccountNo(sc.nextInt(), accts);
						BankAccount dest= validateAccountNo(sc.nextInt(), accts);			
						src.transferFunds(dest, sc.nextDouble());
						System.out.println("Funds transferred!!!");
						break;

					case 10: // close bank account
						System.out.println("Enter Bank Account no to close a/c");
						//trying to remove an entry by key type  : Map' remove
						acctNo=sc.nextInt();
						bankAccount=accts.remove(acctNo);//remove rets : key is found :removes entry n rets
						//removed value ref. If key is not found : rets null
						if(bankAccount == null)
							throw new AccountHandlingException("Invalid A/C no : can't close the a/c");
						System.out.println("Hello , "+bankAccount.getCustName()+" : a/c is closed");
						
						break;
					case 100:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println("Error " + e);
					// e.printStackTrace();
					System.out.println("Pls retry");
				}
				// to clear off pending tokens from buffer of a scanner
				sc.nextLine();
			}
		}

	}
}

	
	

