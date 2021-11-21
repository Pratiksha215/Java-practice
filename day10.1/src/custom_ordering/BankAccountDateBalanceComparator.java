package custom_ordering;

import java.util.Comparator;

import com.banking.BankAccount;

public class BankAccountDateBalanceComparator implements Comparator<BankAccount> {

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		System.out.println("In compare : date n balance(asc)");
		int ret = o1.getCreationDate().compareTo(o2.getCreationDate());
		if (ret == 0) {
			// bal based
			return ((Double) o1.getBalance()).compareTo(o2.getBalance());
		}
		return ret;
	}

}
