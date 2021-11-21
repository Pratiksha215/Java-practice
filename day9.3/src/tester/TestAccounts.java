package tester;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

import com.banking.AcType;
import com.banking.BankAccount;

import custom_excs.AccountHandlingException;
import custom_ordering.BankAccountBalanceComparator;
import custom_ordering.BankAccountDateBalanceComparator;

import static utils.AccountValidationRules.*;
import static com.banking.AcType.*;
import static utils.CollectionUtils.populateList;

public class TestAccounts {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			// create suitable DS to store account details

			ArrayList<BankAccount> accts = populateList();
			boolean exit = false;

			while (!exit) {
				try {
					System.out.println("Menu 1.Create New A/C 2.Display 3. Check for Exists \n"
							+ "4. Fetch A/C Summary 5.Link KYC 6.Apply Interest 7. Close Account \n"
							+ "8. Sort accounts as per asc acct no 9.  Sort accounts as per desc balance "
							+ "10. Funds Transfer \n"
							+ "11. Display phone no of all customers whose a/c is created in specific month n year\n"
							+ "100.Exit");
					System.out.println("Choose Option");
					switch (sc.nextInt()) {
					case 1:

						System.out.println(
								"Enter a/c details : acctNo custName acctType  balance creationDate(yr-mon-day) ");
						// validation rules + a/c instance
						BankAccount a = new BankAccount(sc.nextInt(), validateName(sc.next()),
								parseNValidateAccountType(sc.next().toUpperCase()), validateBalance(sc.nextDouble()),
								validateDate(sc.next()));
						accts.add(a);
						System.out.println("A/C created successfully!!!!!");

						break;
					case 2:
						System.out.println("Display all a/c details");
						for (BankAccount a1 : accts)
							if (a1 != null)
								System.out.println(a1);// BankAccount cls's toString

						break;
					case 3: // 3. Check if acct exists
						// i/p : acct no
						// o/p : present / absent
						System.out.println("Enter acct no");
						int acctNo = sc.nextInt();
						/*
						 * System.out.println(accts.contains(acctNo) ? "Present" : "Absent");// int --->
						 * Integer // list : a1 , a2 , a3 , a4 // acctNo.equals(a1) : false .....Integer
						 * cls's equals method => false since // Integer n BankAccount are in compatible
						 */
						// wrap acct no in BankAccount object ? constr
						BankAccount ref = new BankAccount(acctNo);
						System.out.println(accts.contains(ref) ? "Present" : "Absent");
						// ref.equals(a1) : rets true ---true stops searching
						// rets false ---ref.equals(a2) ---

						break;
					case 4:
						System.out.println("Enter acct no to get a/c summary");
						acctNo = sc.nextInt();
						ref = new BankAccount(acctNo);
						int index = accts.indexOf(ref);
						if (index == -1)
							throw new AccountHandlingException("Invalid a/c no!!!!!");
						// acct no is valid
						System.out.println("Summary " + accts.get(index));
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
						for (BankAccount a1 : accts)
							if (a1.getAcctType().equals(SAVING))
								a1.applyInterest(rate);
						System.out.println("Applied interest....");
						break;
					case 7: // close bank account
						System.out.println("Enter Bank Account no to close a/c");
						index = accts.indexOf(new BankAccount(sc.nextInt()));
						if (index == -1)
							throw new AccountHandlingException("Invalid A/c No : Can't close a/c");
						System.out.println("Closed a/c for Customer Name : " + accts.remove(index).getCustName());
						break;
					case 8:
						System.out.println("Sorting bank accounts as per asc acct no");
						Collections.sort(accts);// not applicable AL<BankAccount>
						// AL : no problem AL IS-A List
						// BankAccount imple Comparable : no problem
						break;
					case 9:
						System.out.println("Sorting bank accounts as per desc balance");
						Collections.sort(accts);// not applicable AL<BankAccount>
						// AL : no problem AL IS-A List
						// BankAccount imple Comparable : no problem

						break;
					case 10:
						System.out.println("Enter src a/c , dest a/c no n amount to transfer");
						// validate src a/c : indexOf + get
						BankAccount src = validateAccountNo(sc.nextInt(), accts);
						// validate dest a/c : indexOf + get
						BankAccount dest = validateAccountNo(sc.nextInt(), accts);
						// call transfer funds
						src.transferFunds(dest, sc.nextDouble());
						System.out.println("Funds transferred....");
						break;
					case 11:// Display phone no of all customers whose a/c is created in specified month n
							// year
						// i/ps : month n year
						System.out.println("Enter month no n year");
						int mon = sc.nextInt();
						int yr = sc.nextInt();
						// add a public non static method in BankAccount class to check date
						System.out.println("List of customer name n phone No ");
						for (BankAccount a1 : accts)
							if (a1.checkDate(mon, yr))
								System.out.println(a1.getCustName() + " : " + a1.getPhoneNo());

						break;
					case 12: // custom ordering by desc balance
						// Collections.sort(accts);//BankAccount's compareTo : Natural ordering
						// Collections : class
						// public static void sort(List<T> l1,Comparator<T> comp)
						// comp : instance (ref) of the class which imple Comparator i/f
						Collections.sort(accts, new BankAccountBalanceComparator());// sort(..) calls internally :
																					// BankAccountBalanceComparato 's
																					// compare : external ordering
																					// (custom)

						break;
					case 13:
						// sorting as per asc order of creation date n balance. : Custom ordering
						Collections.sort(accts, new BankAccountDateBalanceComparator());// sort(..) calls internally
																						// :BankAccountDateBalanceComparator
																						// compare method

						break;
					case 100:
						exit = true;
						break;
					}
				} catch (Exception e) {
					// System.out.println("Error " + e);
					e.printStackTrace();
					System.out.println("Pls retry");
				}
				// to clear off pending tokens from buffer of a scanner
				sc.nextLine();
			}
		}

	}

}
