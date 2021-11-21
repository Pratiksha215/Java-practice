package p1;
import static java.lang.Math.*;
public class OtherFormula implements Formula {

	@Override
	public double squareIt(double a, double b) {
		System.out.println("imple of abstract method : "+this.getClass().getName());
		return pow(a-b,2);
	}
	// can imple class override def method imple , inherited from i/f : YES

	@Override
	public int compute(int a, int b) {
		System.out.println("overrding form of def method");
		return a-b;
	}
	

}
