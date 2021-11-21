/*1.1 Create CollectionUtils ---to ret populated FIXED size list of students (5 records)
Hint : Arrays.asList*/

package utils;

import java.time.LocalDate;
import java.util.HashMap;
import com.studenthashmap.Student;
import com.studenthashmap.Subject;


public class CollectionUtils {
	public static HashMap<Integer,Student>populateStudent(){
		HashMap<Integer,Student> map = new HashMap<>();
		map.put(1,new Student(1, "Pratiksha",LocalDate.parse("1997-07-12"),Subject.CPP, 73.89));
		map.put(1,new Student(2, "Jyoti",LocalDate.parse("1997-07-1"),Subject.CPP, 70.89));
		map.put(1,new Student(3, "Vedanti",LocalDate.parse("1998-02-18"),Subject.CPP, 65.89));
		map.put(1,new Student(4, "Nibha",LocalDate.parse("1997-11-21"),Subject.CPP, 66.89));
		map.put(1,new Student(5, "Komal",LocalDate.parse("1997-03-14"),Subject.CPP, 78.89));
		
		
		map.get(1).studentAddress("Ulhasnagar","Maharashtra","India");
		map.get(1).studentAddress("Mumbai","Maharashtra","India");
		map.get(1).studentAddress("Dadar","Maharashtra","India");
		map.get(1).studentAddress("Parel","Maharashtra","India");
		map.get(1).studentAddress("Thane","Maharashtra","India");
		return map;
	}
}
