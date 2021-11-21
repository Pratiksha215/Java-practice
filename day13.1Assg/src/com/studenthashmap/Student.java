/* Create Student class -- rollNo(string),name,dob(LocalDate),subject(enum),gpa(double)*/

package com.studenthashmap;
import java.time.LocalDate;

public class Student {
	
	private int rollNo;
	private String name;
	private LocalDate dob;
	private Subject subject;
	private double gpa;
	private Address address;

	public Student(int i, String name,LocalDate dob, Subject subject,  double gpa) {
		super();
		this.rollNo = i;
		this.name = name;
		this.dob = dob;
		this.subject = subject;
		this.gpa = gpa;
		
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", dob=" + dob + ", subject="
				+ subject + ", gpa=" + gpa + "]";
	}
	public void studentAddress(String city, String state, String country) {
		address= new Address(city,state,country);
	}
	private class Address{
		private String city,state,country;
		public  Address(String city, String state, String country) {
			this.city=city;
			this.state=state;
			this.country=country;
		}
		
		@Override
		public String toString() {
			return "Address [city=" + city+", state" +state+", country="+country+"]";
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getRollNo() {
		return rollNo;
	}


}
