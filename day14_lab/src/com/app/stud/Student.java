package com.app.stud;
import java.time.LocalDate;
import static java.time.LocalDate.now;

import java.io.Serializable;
import  java.time.temporal.ChronoUnit;
public class Student implements Serializable
{
	/*rollNo(string),name,dob(LocalDate),subject(enum),gpa(double)
	Create Subject enum --OS,JAVA,CPP,DS,AWP,MEAN,DBT
	Add constr & to string & getters*/
	
	private String rollNo;
	private String name;
	private LocalDate dob;
	private Subject curr_subject;
	private double gpa;
	private Address address;
	
	public void setAddress(String city,String state,String country) {
		this.address = new Address(city, state, country);
	}

	public Student(String rollNo, String name, LocalDate dob, Subject curr_subject, double gpa) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
		this.curr_subject = curr_subject;
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", dob=" + dob + ", curr_subject=" + curr_subject
				+ ", gpa=" + gpa + ", address=" + address + "]";
	}

	public String getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public Subject getSubject() {
		return curr_subject;
	}

	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public double calculateAge()
	{
		return (ChronoUnit.YEARS.between(dob,now()));
	}
	
	
	
	
	
}
