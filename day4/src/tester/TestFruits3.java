package tester;

import fruits.Fruit;
import fruits.Mango;
import fruits.Orange;

public class TestFruits3 {

	public static void main(String[] args) {
		Fruit ref = new Mango("mango1");// indirect ref. why no javac err : up casting
		// ref ---> Mango cls instance CP ---> loaded Mango class (taste , pulp)
		ref.taste();// javac --> type of ref : JVM : type of object
		((Mango) ref).pulp();// down casting : explicitly by prog
		ref = new Orange("orange1");// up casting
		// ref ---> Orange cls instance : CP -->Orange class
		ref.taste();// JVM : Orange cls's taste() : @ run time : run time poly =dyn method dispatch
		((Orange) ref).juice();
		if (ref instanceof Mango)
			((Mango) ref).pulp();// JVM run time exception : java.lang.ClassCastException :Orange can't cast into
									// Mango
		else
			System.out.println("Not a mango : can't be pulped!!!!!");

	}

}
