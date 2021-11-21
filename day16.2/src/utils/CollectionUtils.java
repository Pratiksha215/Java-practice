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
	public static HashMap<Integer, Student> populateMap() {
		HashMap<Integer, Student> hm = new HashMap<>();
		hm.put(10, new Student(10, "ravi", parse("1990-12-13"), AWP, 7.5));
		hm.put(15, new Student(15, "riya", parse("1992-12-13"), MEAN, 6.9));
		hm.put(5, new Student(5, "shekhar", parse("1991-12-13"), DBT, 8.9));
		hm.put(12, new Student(12, "priya", parse("1990-02-23"), JAVA, 4.2));
		List<Address> addresses = Arrays.asList(new Address("pune", "MH", "452446"),
				new Address("nagpur", "MH", "852446"), new Address("indore", "MP", "752446"),
				new Address("mumbai", "MH", "672446"));
		int i = 0;
		for (Student s : hm.values())
			s.assignAddress(addresses.get(i++));
		return hm;// rets populated students assigned to the address to the caller.
	}

	// add a static method (which will be invoke by GPA sorter thrd) to return
	// students dtls sorted as per GPA
	public static ArrayList<Student> sortStudentsByGPA(HashMap<Integer, Student> map) {
		// unsorted map : sort it as per GPA
		// can u do : sort it as per GPA : Using TreeMap : NO (since TreeMap can be
		// sorted as per key based criteria
		// convert map --> Collection ---> List(Collections.sort) 
		ArrayList<Student> l1=new ArrayList<>(map.values());//l1 : un sorted
		//function literal 
		//l1 : s1,s2,s3.....s100
		Comparator<Student> compFunction=(s1,s2)-> ((Double)s1.getGpa()).compareTo(s2.getGpa());
		Collections.sort(l1,compFunction);//l1 :  sorted as per GPA
		return l1;
		
	}
	// add a static method (which will be invoke by DoB sorter thrd) to return
		// students dtls sorted as per DoB
		public static ArrayList<Student> sortStudentsByDoB(HashMap<Integer, Student> map) {
			// unsorted map : sort it as per GPA
			// can u do : sort it as per GPA : Using TreeMap : NO (since TreeMap can be
			// sorted as per key based criteria
			// convert map --> Collection ---> List(Collections.sort) 
			ArrayList<Student> l1=new ArrayList<>(map.values());//l1 : un sorted
			
			//function literal 
			Comparator<Student> compFunction=(s1,s2)-> s1.getDob().compareTo(s2.getDob());
			Collections.sort(l1,compFunction);//l1 :  sorted as per DoB
			return l1;
			
		}
}
