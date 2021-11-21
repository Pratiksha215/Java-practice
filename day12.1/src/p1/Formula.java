package p1;

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

}
