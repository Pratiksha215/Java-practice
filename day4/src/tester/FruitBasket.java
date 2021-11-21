/*
 *Write a Tester to create basket of fruits.
(populate basket based on user choice)
Menu 
1. Add Apple
2. Add Orange
3. Add Mango
4. Display taste of all fruits in the basket (for-each)
5 : Exit : terminate the application.
 */
package tester;

import java.util.Arrays;
import java.util.Scanner;
import fruits.*;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		// Create a basket to store the fruits
		System.out.println("Enter basket size");// 10
		Fruit[] basket = new Fruit[sc.nextInt()];// [Lfruits.Fruit : array object
		int counter = 0;
		while (!exit) {
			System.out.println("Menu 1. Add Apple\r\n" + "2. Add Orange\r\n" + "3. Add Mango\r\n"
					+ "4. Display taste of all fruits in the basket (for-each)\r\n"
					+ "5 : Exit : terminate the application.");
			System.out.println("Choose Option");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter Apple's name");
				if (counter < basket.length) {
					basket[counter++] = new Apple(sc.next());// up casting Apple --> Fruit
				} else
					System.out.println("Basket full!!!!!!");
				break;
			case 2:
				System.out.println("Enter Orange's name");
				if (counter < basket.length) {
					basket[counter++] = new Orange(sc.next());// up casting Orange --> Fruit
				} else
					System.out.println("Basket full!!!!!!");
				break;
			case 3:
				System.out.println("Enter Mangoes name");
				if (counter < basket.length) {
					basket[counter++] = new Mango(sc.next());// up casting Mango --> Fruit
				} else
					System.out.println("Basket full!!!!!!");
				break;
			case 4: // Display taste of all fruits in the basket : for-each
				// basket : {m1,m2,a1,null.....null}
				System.out.println("Displaying Fruit Basket");
				for (Fruit f : basket) // f=basket[0],f=basket[1].....
					if (f != null) {
						f.taste();// javac : chks it by type of the ref : Fruit
						if (f instanceof Apple)
							((Apple) f).jam();
						else if (f instanceof Orange)
							((Orange) f).juice();
						else
							((Mango) f).pulp();
					}
//				//JVM : type of the object run time polymorphism
				// System.out.println(Arrays.toString(basket));
				break;

			case 5:
				exit = true;
				break;
			}
		}

		sc.close();

	}

}
