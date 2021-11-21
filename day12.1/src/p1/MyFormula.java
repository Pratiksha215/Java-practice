package p1;
import static java.lang.Math.*;
public class MyFormula implements Formula{

	@Override
	public double squareIt(double a, double b) {
		System.out.println("imple of abstract method : "+this.getClass().getName());
		return pow(a+b,2);
	}
//inherting def method imple
}
