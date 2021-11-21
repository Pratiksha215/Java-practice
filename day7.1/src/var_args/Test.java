package var_args;

import java.util.Arrays;

public class Test {

	public static void main(String... args) {
		System.out.println("Cmd line args : "+Arrays.toString(args));
		displayDetails();
		Animal[] arrAnimal= {new Dog(),new Horse(),new Zebra()};
		displayDetails(arrAnimal);
		displayDetails(new Dog(),new Zebra(),new Horse(),new Dog());

	}

	private static void displayDetails(Animal... animals) {
		System.out.println("Displaying details ....");
		for(Animal a : animals)
			System.out.println(a);//toString : Object
	}

}

class Animal {
}

class Dog extends Animal {
}

class Horse extends Animal {
}

class Zebra extends Animal {
}
//add a static method using var-args syntax
