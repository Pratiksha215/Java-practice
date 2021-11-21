package tester;

import static com.app.core.Subject.AWP;
import static java.time.LocalDate.parse;
import static utils.BinIOUtils.restoreStudentDetails;
import static utils.BinIOUtils.saveStudentDetails;

import java.util.Scanner;

import com.app.core.Student;

public class TestBinIOUtils {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name");
			String file = sc.nextLine();
			Student s = new Student(10, "ravi", parse("1990-12-13"), AWP, 7.5);
			saveStudentDetails(s, file);
			Student restoredDetails = restoreStudentDetails(file);
			System.out.println("Restored details "+restoredDetails);
			restoredDetails.setGpa(s.getGpa()+1);
			saveStudentDetails(restoredDetails, file);
			restoredDetails = restoreStudentDetails(file);
			System.out.println("Restored details again "+restoredDetails);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
