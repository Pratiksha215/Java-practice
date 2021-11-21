package p3;

import static java.lang.Math.pow;

public class Tester {

	public static void main(String[] args) {
		//indirect ref : i/f ref -----> ANY imple class instance
		Formula f1=new MyFormula();
		System.out.println(f1.compute(10, 20));//MyFormula : compute : def imple : add
		System.out.println(f1.squareIt(5, 6));//MyFormula : sq it : sq of adition
		f1=new OtherFormula();
		System.out.println(f1.compute(10, 20));//other formula  : a-b
		System.out.println(f1.squareIt(15, 6));//pow(a-b,2)
	

	}

}
