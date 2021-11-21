package q2.com.app.org;

public class Worker extends Employee {
	private double hoursWorked;
	private double hourlyRate;
	
	public Worker(int id, String name, int deptId, double basic,double hoursWorked, double hourlyRate ) {
		super(id, name, deptId, basic);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public double computeNetSalary() {
		return getBasic()+(hoursWorked*hourlyRate);
	}
	
	@Override
	public String toString() {
		return "Worker " + super.toString() + ", hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate+", Net Salary=" + computeNetSalary();
	}

}
