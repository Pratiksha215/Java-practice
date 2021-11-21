package p4;

public class Utils {
//Write a static method to perform ANY operation(add/subtract/multiply/divide......) 
	//on 2 double arguments & return result.
	//1 n 2nd arg : double operands
	//3rd arg : Functional i/f ref. : SAM
	public static double computeAnyOperation(double i ,double j,Operation op)
	{
		return op.anyOperation(i, j);
	}
}
