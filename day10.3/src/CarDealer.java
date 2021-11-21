package tester;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import static utils.ValidationRules.*;
import com.car.Car;

public class CarDealer {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashSet<Car> carList = new HashSet<>();
			boolean exit = false;

			while (!exit) {
				try {
					System.out.println(" ====Menu==== \n 1.Add a car \n 2.Display car details using for-each\n"
							+ " 3.Display car details using Iterator \n"
							+ " 4.Remove all the cars from HS from a specified manufacturer \n " + "5.Exit");
					System.out.println("Enter Choice");

					switch (sc.nextInt()) {
					// add car details
					case 1:
						System.out.println("Enter car Details : RegNo CompanyName Price color ManDate");
						Car c = new Car(sc.next(), validateParseCompany(sc.next().toUpperCase()), sc.nextDouble(),
								sc.next(), validateDate(sc.next()));
						carList.add(c);
						System.out.println("Car Added Successfully...!");
						break;

					// display car details using for-each()
					case 2:
						if (carList.isEmpty()) {
							System.out.println("Plz 1st Register car");
						} else {
							// System.out.println(carList);//using toString()
							System.out.println("display car details using for-each()");
							for (Car car : carList) {
								System.out.println(car);
							}
						}
						break;

					// display car details using iterator
					case 3:
						if (carList.isEmpty()) {
							System.out.println("Plz 1st Register car");
						} else {
							System.out.println("display car details using iterator");
							Iterator<Car> it = carList.iterator();
							while (it.hasNext())
								System.out.println(it.next());
						}
						break;

					// Remove all the cars from HS from a specified manufacturer
					case 4:
						if (carList.isEmpty()) {
							System.out.println("Plz 1st Register car");
						} else {
							System.out.println("Enter Name of  Manufacturer Company :");
							String com = sc.next().toUpperCase();
							Iterator<Car> it1 = carList.iterator();
							while (it1.hasNext()) {
								//System.out.println("name: " + it1.next().getCompany().equals(com));
								//System.out.println(it1.next().getCompany().name());
								if (it1.next().getCompany().name().equals(com)) {
									it1.remove();
								}
							}
						}
						break;

					case 5:
						exit = true;
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
