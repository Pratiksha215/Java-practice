package p7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.function.Predicate;


public class Test3 {

	public static void main(String[] args) {
		//growable linked list
		LinkedList<Integer> list=new LinkedList<>(Arrays.asList(12,34,1,3,56,7,89,100));
		System.out.println("Orig list ");
		list.forEach(i->System.out.print(i+" "));
		
		//display the ints sorted as per desc order.
		//Collections.sort :  C.O : Collections.sort(List<T> list, Comparator<? super T> comp)
		/*
		 * Collections.sort(list,new Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer o1, Integer o2) { // TODO Auto-generated
		 * method stub return o2.compareTo(o1); }
		 * 
		 * });
		 */
		Collections.sort(list,(i1,i2)->i2.compareTo(i1));
		//display 
		System.out.println("\nSorted  list ");
		list.forEach(i->System.out.print(i+" "));
		
	}

}
