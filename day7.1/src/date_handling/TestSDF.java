package date_handling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestSDF {

	public static void main(String[] args) {
		//create instance of SDF
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter DoB for User 1 : yr-mon-day");
			Date dob1=sdf.parse(sc.next());
			System.out.println("Date's toString"+dob1);//Date's toString
			System.out.println("Formatted string "+sdf.format(dob1));
			System.out.println("Enter DoB for User 2 : yr-mon-day");
			Date dob2=sdf.parse(sc.next());
			System.out.println("CompareTo "+dob1.compareTo(dob2));
			
		} catch (ParseException e) {
	//		System.out.println(e);//display name + error mesg
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
