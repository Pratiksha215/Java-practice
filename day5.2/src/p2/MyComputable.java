package p2;

public  class MyComputable implements Computable {
	@Override // overriding n imple
	public double compute(double a, double b) {
		//implementation classes can directly access i/f constants.
		System.out.println("i/f constant "+data);
		return a+b;
	}
	//can contain additional functionality
	public boolean isEven(int num)
	{
		return num % 2 ==0;
	}
	
}
