package fruits;

public class Mango extends Fruit {
	public Mango(String name) {

		super(name);
	}
	// method overriding :
@Override
	public void taste() {
		System.out.println(getName() + " Has sweet taste");
	}

	// additional functionality
	public void pulp() {
		System.out.println("Making pulp of " + getName());
	}
}
