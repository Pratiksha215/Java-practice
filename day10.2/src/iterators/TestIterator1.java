package iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator1 {

	public static void main(String[] args) {
		// 1. Create a AL of Strings n populate it.
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("abc12345");
		list.add("two");
		list.add("three123");
		list.add("462445");
		list.add("3456");
		System.out.println("List contents via Iterator");
		// 2. Attach iterator to display strings.
		Iterator<String> itr = list.iterator();// Iterator is placed BEFORE the 1st element
		while (itr.hasNext())
			System.out.print(itr.next() + " ");
		// Remove from the list , strings with length > 5
		// what is current position of itr : after the last element
		System.out.println("Trying to remove elems");
		// re attach iterator
		itr = list.iterator();// Iterator is placed BEFORE the 1st element
		while (itr.hasNext()) {
			if (itr.next().length() > 5)
				itr.remove();// No run time error : IllegalStateException : next has to be called prior to
								// remove
		}
		System.out.println(list);//filtered list 

	}

}
