package sets;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import com.app.core.Emp;

public class TestTreeSet2 {

	public static void main(String[] args) {
		// Demo of TreeSet using different constructors
		// create fixed size list of emps using 1 single stmt.
		List<Emp> emps = Arrays.asList(new Emp(100, "abc", "RND", 34567), 
				new Emp(70, "abc4", "RND", 24567),
				new Emp(57, "abc2", "FINANCE", 14567), 
				new Emp(95, "abc9", "RND", 36567),
				new Emp(85, "abc5", "HR", 74567));
		System.out.println("Printing a list");
		for(Emp e : emps)
			System.out.println(e);
		
		// sort these emps in asc order of salary  using a TreeSet : Custom ordering : ano innner class
		//public TreeSet(Comparator<? super E> comparator)
		//new Comparator<Emp>() => instance of a class which imple Comparator i/f
		TreeSet<Emp> ts=new TreeSet<>(new Comparator<Emp>() {
			@Override
			public int compare(Emp e1,Emp e2) {
				System.out.println("in compare : sal based");
				/*
				 * if(e1.getSalary()<e2.getSalary()) return -1;
				 * if(e1.getSalary()==e2.getSalary()) return 0; return 1;
				 */
				return ((Double)e1.getSalary()).compareTo(e2.getSalary());//boxing via type casting
			}
		});
		System.out.println("Printing TS");
		System.out.println(ts);//empty TS
		//populate TS
		ts.addAll(emps);//ano inner's compare will be called
		System.out.println("Printing TS again");
		for(Emp e : ts)
			System.out.println(e);
		
		
		
		

	}

}
