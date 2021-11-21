package p7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test1 {

	public static void main(String[] args) {
		//create fixed size list of ints
		List<Integer> ints=Arrays.asList(12,23,10,34,45,22,40,11);
		
		//display all elems of the list : imperative style
		System.out.println("Display via for-each");
		for(int i : ints)
			System.out.print(i+" ");
		System.out.println("\n Via forEach n ano innner class");
		//Declarative(functional prog) : forEach (ano inner class)
		//Iterable i/f method : public void forEach(Consumer<? super T> c)
		//java.util.function : Consumer : func. i/f
		//SAM : public void accept(T o)
		//inernal iteration : action 
		ints.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				//WHAT : action 
				System.out.print(t+" ");
				
			}
			
		});
		System.out.println("\n Via forEach n lambda expression");
		//to add conciseness to the prog : lambda expr.
		ints.forEach(i -> System.out.print(i+" "));


	}

}
