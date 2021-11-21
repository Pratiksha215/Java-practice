package iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator6 {

	public static void main(String[] args) {
		// 1. Create a AL of Strings n populate it.
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("abc12345");
		list.add("two");
		list.add("three123");
		list.add("462445");
		list.add("3456");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext())
			if (itr.next().length() > 5)
				itr.remove();//structural modi : YES : using Iterator's own API
		System.out.println("list after remove " + list);

	}

}
