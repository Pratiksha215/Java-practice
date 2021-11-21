package non_generic;

public class Tester {

	public static void main(String[] args) {
		// create a Holder class instance to hold int value
		Holder h1=new Holder(1234);//int ---> Integer -->Object
		int data=(Integer)h1.getRef();//P : down casting    javac : auto un boxing
		// create another Holder class instance to hold string
		Holder h2=new Holder("hello");//javac : up casting(string ----> object)
		String s=(String)h2.getRef();//P : down casting
		h1=h2;
		data=(Integer)h1.getRef();//class cast exc : String can't cast to Integer
	}

}
