package fruits;

public class Orange extends Fruit {
	public Orange(String name) {
		super(name);
	}

	// method overriding :
	@Override
	public void taste() {
		System.out.println(getName() + " Has sour taste");
	}

	// additional functionality
	public void juice() {
		System.out.println("Extracting juice of " + getName());
	}
}
