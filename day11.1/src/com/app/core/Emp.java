package com.app.core;

public class Emp implements Comparable<Emp>{
	private int empId;
	private String name, deptName;
	private double salary;

	public Emp(int empId, String name, String deptName, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.deptName = deptName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", deptName=" + deptName + ", salary=" + salary + "]";
	}

	
	 @Override public boolean equals(Object o) {
	  System.out.println("in emp equals"); if (o instanceof Emp) return empId ==
	  ((Emp) o).empId; return false; }
	 
	  @Override public int hashCode() { System.out.println("in hashCode"); return
	  empId;// followed both branches of contract : equal objs ARE producing SAME
	  //hash code // & un equal objs ARE producing DISTINCT hash codes // return 5;
	  }
	 
	@Override
	public int compareTo(Emp e)
	{
		System.out.println("in emp's compareTo");
		return ((Integer)empId).compareTo(e.empId);
	}

	public double getSalary() {
		return salary;
	}
	

}
