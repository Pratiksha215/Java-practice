package q2.com.app.org;

public abstract class Employee {
	private int id;
	private String name;
	private int deptId;
	private double basic;
	
	public Employee(int id, String name, int deptId, double basic) {
		super();
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.basic = basic;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	public abstract double computeNetSalary();
	
	  @Override public String toString() { 
		  return "id=" + id + ", name="
	  + name + ", deptId=" + deptId + ", basic=" + basic; }
	 
	
	
}
