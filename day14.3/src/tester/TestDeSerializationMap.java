package tester;

import static utils.BinIOUtils.restoreStudentDetails;

import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Student;

public class TestDeSerializationMap {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter bin file name to restore student dtls");
			HashMap<Integer, Student> map = restoreStudentDetails(sc.nextLine());
			//display student details from a map
			map.forEach((i,s)->System.out.println(i+" : "+s));
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
