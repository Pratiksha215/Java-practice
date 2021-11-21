package sets;

import java.util.HashSet;

import com.app.core.Emp;

public class EmpSet2 {

	public static void main(String[] args) {
		// create empty HS to store emp details
		HashSet<Emp> empSet=new HashSet<>();
		
		
		Emp e1=new Emp(100, "Rama", "HR", 12345);
		Emp e2=new Emp(100, "Rama1", "HR", 12345);
		Emp e3=new Emp(25, "Rama2", "RnD", 62345);
		Emp e4=new Emp(13, "Kiran", "finance", 345676);
		System.out.println("Added "+empSet.add(e1));//t
		System.out.println("Added "+empSet.add(e2));//f
		System.out.println("Added "+empSet.add(e3));//t
		System.out.println("Added "+empSet.add(e4));//t
		System.out.println(" set size after "+empSet.size());//3
		System.out.println("HS "+empSet);
	
	}

}
