package generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class TestGenerics {

	public static void main(String[] args) {
		Vector<Mgr> mgrs=new Vector<>();
		mgrs.add(new Mgr());
		mgrs.add(new Mgr());
		mgrs.add(new Mgr());
		mgrs.add(new Mgr());
		System.out.println("Vector "+mgrs);
		//ArrayList(Collection<? extends E> coll)
		ArrayList<Emp> emps=new ArrayList<>(mgrs);
		System.out.println("al "+emps);
		LinkedList<Emp> l2=new LinkedList<>(emps);
		//public boolean addAll(Collection<? extends E> c) : AL / HS
		ArrayList<Emp> l3=new ArrayList<>();//empty AL size=0;capa=10
		l3.addAll(mgrs);
		HashSet<TempWorker> hs=new HashSet<>();
	//	hs.addAll(mgrs);//MGR is NOT a TempWorker : javac err
	//	hs.addAll(emps);//Emp IS NOT a TempWorker : javac err
	//	hs.addAll(l2);//Emp IS NOT a TempWorker : javac err
	}

}
