package com.app.org;

public class Manager extends Employee {
	private double perfBonus;

	public Manager(int id, String name, int deptId, double basic, double perfBonus) {
		super(id, name, deptId, basic);
		this.perfBonus=perfBonus;
	}

	public double getPerfBonus() {
		return perfBonus;
	}

	public void setPerfBonus(double perfBonus) {
		this.perfBonus = perfBonus;
	}
	
	public double computeNetSalary() {
		return getBasic()+perfBonus;
	}

	@Override
	public String toString() {
		return "Manager " + super.toString() + ", perfBonus=" + perfBonus + ", Net Salary=" + computeNetSalary();
	}


	


	
	
}
