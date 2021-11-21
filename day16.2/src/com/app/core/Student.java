package com.app.core;

import static java.time.LocalDate.now;
import static java.time.temporal.ChronoUnit.YEARS;

import java.time.LocalDate;

/*
 * 1.1 Create Student class , having rollNo(int),name,dob(localdate),current subject(enum : CPP,JAVA,DBT,AWP etc), gpa(double) ,address;
Add a constructor to init all data members except address
Add toString .
Add a method to assign address to student.(setter)
 */
public class Student   {
	

	private int rollNo;
	private String name;
	private LocalDate dob;
	private Subject currentSubject;
	private double gpa;
	private    Address adr;//meant for JVM : command to JVM : skip from serialization
	public Student(int rollNo, String name, LocalDate dob, Subject currentSubject, double gpa) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
		this.currentSubject = currentSubject;
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", dob=" + dob + ", currentSubject=" + currentSubject
				+ ", gpa=" + gpa + ", adr=" + adr + "]";
	}
	public void assignAddress(Address a)
	{
		this.adr=a;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public Subject getCurrentSubject() {
		return currentSubject;
	}
	public double getGpa() {
		return gpa;
	}
	public Address getAdr() {
		return adr;
	}
	//add a method to compute age
	public long computeAge()
	{
		return YEARS.between(dob, now());
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
}
