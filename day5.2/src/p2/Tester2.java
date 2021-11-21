package p2;

public class Tester2 {

	public static void main(String[] args) {
		//indirect referencing : interfaces
		//I/f can't be instantiated 
		//i/f ref can DIRECTLY (w/o type casting)  refer to ANY implementation class .(IS A) 
		Computable ref;//i/f type of reference , method local var  : stack
		ref=new MyComputable();//up casting
		System.out.println(ref.compute(10, 20));//javac resolves it by type of ref : Computable 
		//JVM : for virtual (non private / non static n non final ) : type of the object : run time polymorphism 
		MyComputable myComputable=(MyComputable)ref; //explicit down casting
		System.out.println(myComputable.isEven(13));
	}

}
