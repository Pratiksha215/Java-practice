package p7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Predicate;

/*
 * 2. Collection i/f method
default boolean removeIf(Predicate<? super E> filter)
Removes all of the elements of this collection that satisfy the given predicate. 

java.util.Predicate<T> : func i/f
SAM :
boolean test(T t)
Evaluates this predicate on the given argument.
Objective : Create a list of ints ( growable : AL/LinkedList/Vector) .
Remove all odd elems n print the list
 */
public class Test5 {

	public static void main(String[] args) {
		//growable linked list from fixed size list
		LinkedList<Integer> list=new LinkedList<>(Arrays.asList(12,34,1,3,56,7,89,100));
		System.out.println("After remove");
		
		list.removeIf(i -> i %2 == 0);
		
		//default void forEach(Consumer<? super T> action)
		//can u combine 2 ops : removeIf n display on 1 line ? NO
	//	list.removeIf(i -> i %2 == 0).forEach(a -> System.out.print(a+" ")); : javac err : void : can't combine multiple ops.
		//Enter Java 8 streams programming
	}

}
