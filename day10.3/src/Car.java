package com.car;

import java.time.LocalDate;

public class Car {
	
	private String regNo;
	private Company company;
	private double price;
	private String color;
	private LocalDate manufactureDate;
	
	public Company getCompany() {
		return company;
	}

	public Car(String regNo, Company company, double price, String color, LocalDate manufactureDate) {
		super();
		this.regNo = regNo;
		this.company = company;
		this.price = price;
		this.color = color;
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", company=" + company + ", price=" + price + ", color=" + color
				+ ", manufactureDate=" + manufactureDate + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("In hashCode");
		return regNo.hashCode()+manufactureDate.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("In equals");
		if(obj instanceof Car) {
			Car c = (Car)obj;
			return regNo.equals(c.regNo) &&
					manufactureDate.equals(c.manufactureDate);
		}
		return false;
	}
	
	
	
}
