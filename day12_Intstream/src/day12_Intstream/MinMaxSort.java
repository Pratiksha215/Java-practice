package day12_Intstream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MinMaxSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream stream = IntStream.of(10,-23,45,19,345,56,12,100);
		OptionalInt obj = stream.max();
		if(max.isPresent())
		System.out.println("Max::"+obj.getAsInt());
		else
          System.out.println("No value.....");
		
		IntStream stream1 = IntStream.of(10,-23,45,19,345,56,12,100);
		OptionalInt obj1= stream1.min();
		if(min.isPresent())
		System.out.println("Min::"+obj1.getAsInt());
		else
			System.out.println("No value.....");
		
		IntStream stream2 = IntStream.of(10,-23,45,19,345,56,12,100);
		stream2.sorted().forEachOrdered(p->System.out.println(p));
	}
}
