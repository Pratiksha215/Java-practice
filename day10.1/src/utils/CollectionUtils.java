package utils;

import java.util.ArrayList;

import com.banking.BankAccount;
import static com.banking.AcType.*;
import static java.time.LocalDate.*;

public class CollectionUtils {
//add a static method to return populated list of bank accts
	public static ArrayList<BankAccount> populateList() {
		/*
		 * 101 Madhura fd 1234567 2020-07-24 10 Madhura saving 4567 2020-05-02 25 Rama
		 * current 5000 2020-06-25 2 Shekhar saving 6000 2020-06-09
		 */
		// create empty AL
		ArrayList<BankAccount> l1 = new ArrayList<>();
		l1.add(new BankAccount(101, "Madhura", FD, 123456, parse("2020-07-24")));
		l1.add(new BankAccount(10, "Shekhar", SAVING, 7000, parse("2020-05-24")));
		l1.add(new BankAccount(56, "Kiran", CURRENT, 4500, parse("2020-05-24")));
		l1.add(new BankAccount(85, "Riya", SAVING, 8000, parse("2020-08-05")));
		l1.add(new BankAccount(34, "Rama", SAVING, 6500, parse("2020-05-24")));

        l1.get(0).linkKYC("madhura@gmail.com", "Pune", "456255656");
        l1.get(1).linkKYC("shekhar@gmail.com", "Delhi", "676255656");
        l1.get(2).linkKYC("kiran@gmail.com", "Chennai", "896255656");
        l1.get(3).linkKYC("riya@gmail.com", "Indore", "996255656");
        l1.get(4).linkKYC("rama@gmail.com", "Pune", "806255656");
		return l1;// CollectionUtils rets populated list of bank accounts linked with KYC details ,  to caller.

	}

	
}
