package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import com.app.core.Address;
import com.app.core.Student;
import static java.time.LocalDate.*;
import static com.app.core.Subject.*;

public class CollectionUtils {
//add a static method which will be invoked by main : to ret populated Map
	public static ArrayList<Student> populateList() {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(10, "ravi", parse("1990-12-13"), AWP, 7.5));
		list.add(new Student(15, "riya", parse("1992-12-13"), MEAN, 6.9));
		list.add(new Student(5, "shekhar", parse("1991-12-13"), DBT, 8.9));
		list.add(new Student(12, "priya", parse("1990-02-23"), JAVA, 4.2));
		List<Address> addresses = Arrays.asList(new Address("pune", "MH", "452446"),
				new Address("nagpur", "MH", "852446"), new Address("indore", "MP", "752446"),
				new Address("mumbai", "MH", "672446"));
		int i = 0;
		for (Student s : list)
			s.assignAddress(addresses.get(i++));
		return list;// rets populated students assigned to the address to the caller.
	}

	// add a static method (which will be invoked by GPA sorter thrd) to return
	// students dtls sorted as per GPA
	public static  ArrayList<Student> sortStudentsByGPA(ArrayList<Student> l1) {
		Comparator<Student> compFunction = (s1, s2) -> ((Double) s1.getGpa()).compareTo(s2.getGpa());
		Collections.sort(l1, compFunction);// l1 : sorted as per GPA
		return l1;
	}
	// add a static method (which will be invoked by DoB sorter thrd) to return
		// students dtls sorted as per DoB
		public static  ArrayList<Student> sortStudentsByDoB(ArrayList<Student> l1) {
			Comparator<Student> compFunction = (s1, s2) -> s1.getDob().compareTo(s2.getDob());
			Collections.sort(l1, compFunction);// l1 : sorted as per Dob
			return l1;
		}

	
}
