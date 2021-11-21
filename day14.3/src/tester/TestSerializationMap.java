package tester;

import static utils.BinIOUtils.saveStudentMapDetails;
import static utils.CollectionUtils.populateMap;

import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Student;

public class TestSerializationMap {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name");
			String file = sc.nextLine();
			HashMap<Integer, Student> map = populateMap();
			saveStudentMapDetails(map, file);
			System.out.println("Data stored...");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over.....");

	}

}
