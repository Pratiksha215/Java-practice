package q4.com.app.stack;

public class Employee {
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "\nid=" + id + ", name=" + name ;
	}
	
}
