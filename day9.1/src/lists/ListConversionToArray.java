package lists;

import java.util.ArrayList;
import java.util.Arrays;

public class ListConversionToArray {

	public static void main(String[] args) {
		ArrayList<String> strings=new ArrayList<>();
		strings.add("vcxvgf");
		strings.add("one");
		strings.add("two");
		strings.add("three");
		strings.add("four");
		strings.add("five");
		//convert this to a fixed size array.
		String[] ss=new String[strings.size()];//array obj : 6 nulls
		System.out.println("array before "+Arrays.toString(ss));
		ss=strings.toArray(ss);
		System.out.println("array after "+Arrays.toString(ss));
		

	}

}
