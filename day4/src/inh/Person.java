package inh;

public class Person {
	private String firstName, lastName;
	//parameterized constr

	public Person(String firstName, String lastName) {
		super();
		System.out.println("in person's constr");
		this.firstName = firstName;
		this.lastName = lastName;
	}
//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
	
}
