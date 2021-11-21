package tester;
import static utils.CollectionUtils.*;

import java.util.Map;
import java.util.Set;
import static java.util.Map.Entry;

import com.banking.BankAccount;

public class TestCollectionViewOfMap {

	public static void main(String[] args) {
		//get a populated map from sample data : from CollectionUtils
		Map<Integer, BankAccount> acctsMap = populateMap(populateList());
		//display all acct nos of this map
		Set<Integer> acctNos=acctsMap.keySet();
		System.out.println("Keys : ");
		for(int i : acctNos)
			System.out.print(i+" ");
		//display all acct details : values
		System.out.println("All accts");
		for(BankAccount a : acctsMap.values())//IMPORTANT
			System.out.println(a);
		//display acct no & account details  : entrySet
		for(Entry<Integer,BankAccount> e : acctsMap.entrySet())
			System.out.println(e.getKey()+":"+e.getValue());
		
	}

}
