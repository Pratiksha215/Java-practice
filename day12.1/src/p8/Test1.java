package p8;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.IntStream;

//Combine 2 ops : keep (filter) even elems  n display on 1 line ? YES : Java 8 streams
public class Test1 {

	public static void main(String[] args) {
		int[] data = { 12, 34, 1, 3, 56, 7, 89, 100 };
		// How to attach stream (sequential) to array
		/*
		 * Arrays class method public static IntStream stream(int[] array)
		 *  Returns a
		 * sequential IntStream with the specified array as its source. 
		 * IntStream : A i/f to represnt 
		 * sequence of primitive int-valued elements supporting sequential and parallel
		 * aggregate operations.
		 */
//		IntStream intStrm=Arrays.stream(data);//array --> int stream
		//filter out only even elems
		//IntStream method : public IntStream filter(IntPredicate p)
		//SAM : of IntPredicate is : boolean test(int value)
		//Evaluates this predicate on the given argument.
		Arrays.stream(data).filter(i-> i % 2==0).forEach(i->System.out.print(i+" "));

	}

}
