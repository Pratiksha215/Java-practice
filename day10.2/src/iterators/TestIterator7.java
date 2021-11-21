package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestIterator7 {

	public static void main(String[] args) {
		// 1. Create a AL of Strings n populate it.
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("abc12345");
		list.add("two");
		list.add("three123");
		list.add("462445");
		list.add("3456");

	//display the elements in reverse order : last ----first
		//is it possible to solve it using Iterator ? : NO : hasNext n next methods
		//Soln : use ListIterator
		ListIterator<String> litr=list.listIterator(list.size());//Litr : after the last elem.
		System.out.println("Printing the elems in reverse order");
		while(litr.hasPrevious())
			System.out.println(litr.previous());

	}

}
