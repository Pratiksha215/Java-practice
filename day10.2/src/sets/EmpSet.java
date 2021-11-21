package sets;

import java.util.HashSet;

import com.app.core.Emp;

public class EmpSet {

	public static void main(String[] args) {
		// create empty HS to store emp details
		HashSet<Emp> empSet=new HashSet<>();
		//size : 0 , capa 16 , load factor 0.75
		System.out.println("Orig set size "+empSet.size());
		
		Emp e1=new Emp(100, "Rama", "HR", 12345);
		Emp e2=new Emp(100, "Rama1", "HR", 12345);
		Emp e3=new Emp(100, "Rama2", "RnD", 62345);
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		System.out.println(" set size after "+empSet.size());//3
		System.out.println("HS "+empSet);//e1 e2 e3
		System.out.println(e1.equals(e2));//true
		System.out.println(e1.equals(e3));//true
		//e1 e2 e3 are equal objs : via equals : YES
		System.out.println(e1.hashCode()+" "+e2.hashCode()+" "+e3.hashCode());// different

	}

}
