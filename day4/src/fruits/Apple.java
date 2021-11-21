package fruits;

public class Apple extends Fruit {
	public Apple(String name) {
		super(name);
	}
	//method overriding : 
	public void taste() {
		System.out.println(getName()+" Has sweet  n sour taste");
	}
	//additional functionality
	public void jam()
	{
		System.out.println("Making jam of "+getName());
	}
}
