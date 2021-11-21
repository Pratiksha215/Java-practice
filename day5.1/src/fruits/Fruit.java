package fruits;

public abstract class Fruit {
	private String name;

	public Fruit(String name) {
		this.name = name;
	}

	// add a taste method in super class
	//abstract method declaration
	public abstract void taste(); 

	public String getName() {
		return name;
	}
	public final void show()
	{
		System.out.println("in A's show");
	}

}
