package p4;
import static p4.Utils.computeAnyOperation;

public class Tester {

	public static void main(String[] args) {
		// add 2 numbers n display the result
		System.out.println(computeAnyOperation(10, 20,new Adder()));//@ run time : Adder's anyOperation
		// subtract 2 numbers n display the result
		System.out.println(computeAnyOperation(10, 20,new Subtractor()));
		// multiply 2 numbers n display the result
		System.out.println(computeAnyOperation(10, 20,new Multiplier()));
	}

}
