package utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.app.core.Address;
import com.app.core.Student;
import static java.time.LocalDate.*;
import static com.app.core.Subject.*;

public class CollectionUtils {
//add a static method to ret populated Map
	public static HashMap<Integer, Student> populateMap() {
		HashMap<Integer, Student> hm = new HashMap<>();
		hm.put(10, new Student(10, "ravi", parse("1990-12-13"), AWP, 7.5));
		hm.put(15, new Student(15, "riya", parse("1992-12-13"), MEAN, 6.9));
		hm.put(5, new Student(5, "shekhar", parse("1991-12-13"), DBT, 8.9));
		hm.put(12, new Student(12, "priya", parse("1990-02-23"), JAVA, 4.2));
		List<Address> addresses = Arrays.asList(new Address("pune", "MH", "452446"),
				new Address("nagpur", "MH", "852446"), new Address("indore", "MP", "752446"),
				new Address("mumbai", "MH", "672446"));
		int i=0;
		for(Student s : hm.values())
			s.assignAddress(addresses.get(i++));
		return hm;//rets populated students assigned to the address to the caller.
	}
}
