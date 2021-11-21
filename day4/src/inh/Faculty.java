package inh;

public class Faculty extends Person {
	private int yrsOfExperience;
	private String sme;
	public Faculty(String firstName, String lastName, int yrsOfExperience, String sme) {
		super(firstName, lastName);
		System.out.println("in faculty constr");
		this.yrsOfExperience = yrsOfExperience;
		this.sme = sme;
	}
	

}
