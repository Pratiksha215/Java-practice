package nested_class;

public class Tester {

	public static void main(String[] args) {
		//create in 1 line instance of the nested(inner) class
		Outer.Nested nestedClsRef=new Outer(88).new Nested(99);
		nestedClsRef.displayInner();//since displayInner : default scoped method in nested class.

	}

}
