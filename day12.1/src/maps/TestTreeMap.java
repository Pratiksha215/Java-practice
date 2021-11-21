package maps;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> hm = new TreeMap<>();//sorted (as per key based criteria)
		//un ordered Map : Natural ordering based (Integer cls's compareTo)
		hm.put(1, "abc");
		hm.put(10, "abc10");
		hm.put(56, "abc56");
		hm.put(45, "abc45");
		hm.put(78, "abc78");
		hm.put(100, "abc100");
		hm.put(15, "abc15");
		hm.put(25, "abc25");
		// display all entries from HM , on separate lines
		for (Entry<Integer, String> e : hm.entrySet())
			System.out.println(e.getKey() + ":" + e.getValue());
		

	}

}
