package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		// Arrays : public static List<T> asList(T... arg)
		List<Double> list = Arrays.asList(7.5, 24.0, 13.6, 4.0, 5.7,7.5);// int--->Integer ---X---Double
		System.out.println("List "+list);
		// Populate list ---> HashSet
		// public HashSet(Collection<? extends E> c)
		HashSet<Double> hs = new HashSet<>(list);// javac chks : List is a Collection, geenric type of a List : Double
													// or its sub type
		System.out.println("HS "+hs);
		//Populate list ---> LinkedHashSet
		LinkedHashSet<Double> lhs=new LinkedHashSet<>(list);
		System.out.println("LHS "+lhs);//ordered set
		

	}

}
