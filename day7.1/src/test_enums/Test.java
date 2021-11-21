package test_enums;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Display all directions");
			// ans this!!!
			for (Direction d : Direction.values())
				System.out.println(d);// toString of Enum
			System.out.println("Choose a direction : string ");
			// convert it to the enum :
			Direction d1 = Direction.valueOf(sc.next().toUpperCase());
			System.out.println("Chosen direction " + d1);
			// switch-case along with enum
			switch (d1) {
			case EAST:
				System.out.println("1");
				break;

			case WEST:
				System.out.println("2");
				break;
			case SOUTH:
				System.out.println("3");
				break;

			case NORTH:
				System.out.println("4");
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
