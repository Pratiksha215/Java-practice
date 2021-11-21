package tester;

import fruits.Fruit;
import fruits.Mango;
import fruits.Orange;

public class TestFruits {

	public static void main(String[] args) {
		// super class ref, super cls instance , sub class ref , sub class instance
		System.out.println("Checking Fruit's taste");
		Fruit f1 = new Fruit("some fruit");// direct referencing : super ref ---> super cls instance
		f1.taste();
		System.out.println("Checking Mangoes' taste : direct ref");
		Mango m1 = new Mango("Mango1");// direct referencing : sub ref ---> sub cls instance
		m1.taste();
		Fruit ref;// ref : super class ref
		ref = m1;// javac performs : implicit : up casting
		System.out.println("Checking Mangoes' taste : indirect ref");
		ref.taste();// javac resolves it by type of the reference;JVM resolves it by type of the
					// object : run time polymorphism
		ref=new Orange("mandarine");//up casting
		ref.taste();

	}

}
