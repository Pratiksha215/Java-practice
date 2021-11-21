package generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestWildCard {

	public static void main(String[] args) {
		List<Integer> ints=Arrays.asList(1,2,3,4,5,6);
		List<String> strings=Arrays.asList("one","two","three","four","five");
		List<Double> doubles=Arrays.asList(2.3,1.2,4.0,6.7,8.99);
		//Collections class method : public static void shuffle(List<?> list)
		Collections.shuffle(ints);
		System.out.println(ints);
		Collections.shuffle(strings);
		System.out.println(strings);
		Collections.shuffle(doubles);
		System.out.println(doubles);
		

	}

}
