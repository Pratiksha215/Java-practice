package generic;

public class Tester {

	public static void main(String[] args) {
		// create a Holder class instance to hold int value
		//diamond operator : Generic type of RHS is inferred / deduced from LHS type
		Holder<Integer> h1 = new Holder<>(1234);// int ---> Integer
		int data = h1.getRef();// Integer --> int javac : auto un boxing
		// create another Holder class instance to hold string
		Holder<String> h2 = new Holder<>("hello");// javac : NO CONVERSION
		String s =  h2.getRef();
	//	h1=h2;//type mismatch error caught @ compile time
		// P : down casting
		/*
		 * h1=h2; data=(Integer)h1.getRef();//class cast exc : String can't cast to
		 * Integer
		 */ }

}
