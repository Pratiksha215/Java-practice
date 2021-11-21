package iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator5 {

	public static void main(String[] args) {
		// 1. Create a AL of Strings n populate it.
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("abc12345");
		list.add("two");
		list.add("three123");
		list.add("462445");
		list.add("3456");
		
		for(String s : list) //for-each : Implicitly Iterator : conc modification exc.
			if(s.length()> 5)
				list.remove(s);//structural modifiaction 
		System.out.println(list);
				
		
	}

}
