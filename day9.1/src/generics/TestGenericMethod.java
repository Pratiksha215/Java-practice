package generics;

import java.util.Arrays;
import java.util.List;

public class TestGenericMethod {

	public static void main(String[] args) {
		//String[] ---> List<String>
		List<String> strings=Arrays.asList("abc","dfg","ertqerter","35435");
		System.out.println(strings);
		System.out.println(strings.get(0));
	//	strings.add("hello");//Unsupported op. exc
	//	strings.remove(strings.size()-1);
		strings.set(0, strings.get(0).toUpperCase());//not changing the size
		System.out.println("Strings again "+strings);

	}

}
