package custom_ordering;

import java.util.Comparator;

import com.banking.BankAccount;

public class BankAccountDateTypeComparator implements Comparator<BankAccount> {

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		// date n type
		// first do comparison based upon dates
		int val = o1.getCreationDate().compareTo(o2.getCreationDate());
		if (val == 0) {
			// if dates are same : comapre them as per type : Enum
			return o1.getAcctType().compareTo(o2.getAcctType());// ordinal based comparison
		}
		return val;
	}

}
