package tester;

import fruits.Apple;
import fruits.Fruit;
import fruits.Mango;
import fruits.Orange;

public class TestFruits2 {

	public static void main(String[] args) {
		//dynamic init of array
		int[] data=  {1,2,3,4,5,6};
		for(int i : data)
			System.out.print(i);
		Fruit[] fruits= {new Orange("orange1"),new Mango("mango1"),new Apple("apple1")};
		System.out.println();
		System.out.println("Fruits");
		for(Fruit f : fruits)
			f.taste();
		

	}

}
