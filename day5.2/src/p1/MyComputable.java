package p1;

public class MyComputable implements Computable {
	@Override // overriding n imple
	public double compute(double a, double b) {
		//implementation classes can directly access i/f constants.
		System.out.println("i/f constant "+data);
		return a+b;
	}
}
