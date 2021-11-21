package p3;
import static p3.Formula.print;

public class TestStaticMethod {

	public static void main(String[] args) {
		Formula f1 = new MyFormula();
		// downcasting Formula ---> MyFormula
		if (f1 instanceof MyFormula)
			((MyFormula) f1).testMe();
		//How to invoke static method of i/f from non imple class ?
		print("other mesg!!!!!");
		

	}

}
