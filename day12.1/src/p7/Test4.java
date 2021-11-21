package p7;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.BiConsumer;

import static java.util.Map.Entry;

public class Test4 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();//un sorted un ordered Map
		hm.put(1, "abc");
		hm.put(10, "abc10");
		hm.put(56, "abc56");
		hm.put(45, "abc45");
		hm.put(78, "abc78");
		hm.put(100, "abc100");
		hm.put(15, "abc15");
		hm.put(25, "abc25");
		// display all entries from HM , on separate lines
		/*
		 * for (Entry<Integer, String> e : hm.entrySet()) System.out.println(e.getKey()
		 * + ":" + e.getValue());
		 */	//can you attach a for-each directly to Map ? NO (Map is not Iterable)
		//till JDK 1.7 : YES
		//Map : forEach : method in Map i/f 
		//public void forEach(BiConsumer<? super T,? super U> biCon)
		//BiConsumer : func i/f
		//SAM public void accept(T t,U u) {action}
		/*
		 * hm.forEach(new BiConsumer<Integer, String>() {
		 * 
		 * @Override public void accept(Integer t, String u) {
		 * System.out.println(t+":"+u);
		 * 
		 * }
		 * 
		 * });
		 */
		System.out.println("display via forEach n lambda expr");
		//lambda expr
		hm.forEach((k,v) -> System.out.println(k+":"+v));
		
		

	}

}
