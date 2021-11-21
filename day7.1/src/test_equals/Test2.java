package test_equals;

public class Test2 {

	public static void main(String[] args) {
		Object c1=new Car(12345, "red", 500000);//c1 ---> Car #1 instance CP ---> Car class
		Object c2=new Car(12346, "red", 500000);//c2 ---> Car # 2 instance CP --> Car class
		
		System.out.println(c1.equals(c2));//JVM : whose equals method :  Car
		String s="hello";
		System.out.println(c1.equals(s));
		
	

	}

}
