package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class IntegerSet2 {

	public static void main(String[] args) {
		// create empty HashSet & populate it with ints.
		//public HashSet(Collection<? extends E> c)
		List<Integer> ints=Arrays.asList(1,2,3,56,45,21,2,1,49,50,123);//fixed size
		
		HashSet<Integer> hs=new HashSet<>(ints);//hs : growable
		System.out.println("HS before "+hs);
		//search for an elem
		System.out.println(hs.contains(56)?"Present":"Absent");
		//remove the element
		System.out.println("Removed "+hs.remove(56));
		System.out.println("HS again "+hs);
		
		

	}

}
