package inh;

public class Student extends Person{
	private int gradYear;
	private String course;
	private double fees;
	private int marks;
	public Student(String fName,String lName,int gradYear,String course,double fees,int marks) {
		
		super(fName,lName);//invokes immediate super cls's MATCHING constr.
		System.out.println("in student's constr");
		this.gradYear=gradYear;
		this.course=course;
		this.fees=fees;
		this.marks=marks;
		
	}

}
