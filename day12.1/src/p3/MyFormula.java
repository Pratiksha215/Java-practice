package p3;
import static java.lang.Math.*;
import static p3.Formula.print;
public class MyFormula implements Formula{

	@Override
	public double squareIt(double a, double b) {
		compute(10,13);//invoking def imple
		System.out.println("imple of abstract method : "+this.getClass().getName());
		return pow(a+b,2);
	}
//inherting def method imple
	//can imple class add it's own new func ? : YES
	public void testMe()
	{
		//how to invoke static method : defined in the i/f : 
		print("Some mesg");
	}
}
