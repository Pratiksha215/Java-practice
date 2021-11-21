package p3;

public interface Formula {
	//javac adds : public static final
	int data = 100;
//javac adds : public abstract
	double squareIt(double a, double b);
//javac add : public
	default int compute(int a, int b) {
		System.out.println("in default method : i/f");
		return a + b;
	}
	//can add static methods implementation since Java 8
	//which are keyword/s added implicitly by javac ? : public 
	
	static void print(String mesg)
	{
		System.out.println("in static method : printing "+mesg);
	}

}
