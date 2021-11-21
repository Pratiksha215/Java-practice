package maps;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class TestLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();//un sorted  ordered Map
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
