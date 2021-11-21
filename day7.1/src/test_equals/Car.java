package test_equals;

public class Car {
	private int regNo;
	private String color;
	private double price;

	public Car(int regNo, String color, double price) {
		super();
		this.regNo = regNo;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", color=" + color + ", price=" + price + "]";
	}

	// override equals method inherited from Object class to replace ref equality by
	// content equality.(chk for Car's identity : PK (unique ID ) : reg no
	@Override
	public boolean equals(Object o)// overriding version
	{
		System.out.println("in car equals");
		if (o instanceof Car) {
			Car c = (Car) o;
			return this.regNo == c.regNo;
		}
		return false;
	}

}
