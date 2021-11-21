package maps;

//display the map entries in desc order of ints.(ano inner class)
import java.util.Map.Entry;
import java.util.Comparator;
import java.util.TreeMap;

public class TestTreeMap2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> hm = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				System.out.println("in ano inner's compare");
				return o2.compareTo(o1);
			}

		});// sorted (as per key based criteria)
		// un ordered Map : Custom ordering based (comp's compare)
		System.out.println("Sorted TM "+hm);//empty Map
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
