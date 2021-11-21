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
public class Test2 {

	public static void main(String[] args) {
		//growable linked list
		LinkedList<Integer> list=new LinkedList<>(Arrays.asList(12,34,1,3,56,7,89,100));
		list.forEach(i->System.out.print(i+" "));
		/*
		 * list.removeIf(new Predicate<Integer>() {
		 * 
		 * @Override public boolean test(Integer t) { // remove odd elems : whenevr test
		 * method rets true : elem will be removed return t % 2 != 0;//auto un boxing }
		 * 
		 * });
		 */
		list.removeIf(i -> i %2 != 0);
		System.out.println("After remove");
		list.forEach(i->System.out.print(i+" "));
	}

}
