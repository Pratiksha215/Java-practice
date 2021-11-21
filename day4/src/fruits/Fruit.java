package fruits;

public class Fruit {
	private String name;

	public Fruit(String name) {
		this.name = name;
	}

	// add a taste method in super class

	public void taste() {
		System.out.println(" No specific taste...");
	}

	public String getName() {
		return name;
	}

}
