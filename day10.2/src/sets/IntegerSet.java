package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class IntegerSet {

	public static void main(String[] args) {
		// create empty HashSet & populate it with ints.
		//public HashSet(Collection<? extends E> c)
		List<Integer> ints=Arrays.asList(1,2,3,56,45,21,2,1,49,50,123);//fixed size
		//ints.add(3456);//run time err : un supported op 
		HashSet<Integer> hs=new HashSet<>(ints);//hs : growable
		hs.add(999);
		System.out.println("HS via toString "+hs);
		//display elems of HS via Iterator
		Iterator<Integer> itr=hs.iterator();
	//	hs.remove(2); : un comment it n chk concurrent modification exc : @ line 23
		System.out.println("HS via Iterator ");
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		//display elems of HS via for-each
		System.out.println("\n HS via for-each");
		for(int i : hs)
			System.out.print(i+" ");
		

	}

}
