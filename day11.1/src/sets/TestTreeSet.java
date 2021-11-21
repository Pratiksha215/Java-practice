package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import com.app.core.Emp;

public class TestTreeSet {

	public static void main(String[] args) {
		// Demo of TreeSet using different constructors
		// create fixed size list of emps using 1 single stmt.
		List<Emp> emps = Arrays.asList(new Emp(1, "abc", "RND", 34567), 
				new Emp(10, "abc4", "RND", 24567),
				new Emp(17, "abc2", "FINANCE", 14567), 
				new Emp(95, "abc9", "RND", 36567),
				new Emp(85, "abc5", "HR", 74567));
		System.out.println("Printing a list");
		for(Emp e : emps)
			System.out.println(e);
		
		// sort these emps in asc order of emp id using a TreeSet : Natural ordering
		TreeSet<Emp> ts1=new TreeSet<>(emps);//while populating TS : Emp's compareTo method is invoked
		System.out.println("Printing a TreeSet using Natural Ordering ");
		for(Emp e : ts1)
			System.out.println(e);
	
		
		

	}

}
