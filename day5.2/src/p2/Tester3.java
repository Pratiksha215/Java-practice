package p2;

public class Tester3 {

	public static void main(String[] args) {
		Computable ref;// i/f type of reference , method local var : stack
		ref = new MyComputable();// up casting
		System.out.println(ref.compute(10, 20));// javac resolves it by type of ref : Computable
		System.out.println(((MyComputable) ref).isEven(14));//down casting (type cast)
		ref = new OtherComputable();
		System.out.println(ref.compute(10, 20));//run time poly.
		if (ref instanceof MyComputable)
			System.out.println(((MyComputable) ref).isEven(14));
		// run tine err : ClassCastException : OtherComputable can't
		// be cast into MyComputable
		else 
			System.out.println("Invalid computable !!!!!!");

	}

}
