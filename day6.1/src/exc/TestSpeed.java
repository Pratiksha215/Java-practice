package exc;

import static utils.ValidationUtils.validateSpeed;

import java.util.Scanner;

public class TestSpeed {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter current speed");
			validateSpeed(sc.nextInt());
		} catch (Exception e) {
		//	System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("main continued....");

	}

}
