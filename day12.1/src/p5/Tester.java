package p5;

import static p5.Utils.computeAnyOperation;

public class Tester {

	public static void main(String[] args) {
		// add 2 numbers n display the result
		System.out.println(computeAnyOperation(10, 20, new Operation() {

			@Override
			public double anyOperation(double a, double b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		}));// @ run time : addition
		// subtract 2 numbers n display the result
		System.out.println(computeAnyOperation(10, 20, new Operation() {

			@Override
			public double anyOperation(double a, double b) {
				// TODO Auto-generated method stub
				return a - b;
			}
		}));
		// multiply 2 numbers n display the result
		System.out.println(computeAnyOperation(10, 20, new Operation() {

			@Override
			public double anyOperation(double a, double b) {
				// TODO Auto-generated method stub
				return a * b;
			}
		}));
	}

}
