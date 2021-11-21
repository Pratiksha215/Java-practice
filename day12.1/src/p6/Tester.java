package p6;

import static p6.Utils.computeAnyOperation;

public class Tester {

	public static void main(String[] args) {
		// add 2 numbers n display the result
		System.out.println(computeAnyOperation(10, 20, (a1, b1) -> a1 + b1));// @ run time : addition
		// subtract 2 numbers n display the result
		System.out.println(computeAnyOperation(10, 20, (a, b) -> a - b));
		// multiply 2 numbers n display the result
		System.out.println(computeAnyOperation(10, 20, (a, b) -> {
			System.out.println("in multi line lambda ....");
			return a * b;
		}));
		int a = 100;// integer literal
		String s = "dfhgsf";// string literal
		// Can you assign entire behaviour / functionality to a variable ???? YES : func
		// i/f ref
		Operation division = (c, d) -> c / d;
		System.out.println(computeAnyOperation(25, 6, division));// floating point based div

	}

}
