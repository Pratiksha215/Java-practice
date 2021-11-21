package test_equals2;

public class Test2 {

	public static void main(String[] args) {
		Object c1=new Car(12345, "red", 500000);//c1 ---> Car #1 instance CP ---> Car class
		Object c2=new Car(12346, "red", 500000);//c2 ---> Car # 2 instance CP --> Car class
		Object c3=new Car(12345, "black", 500000);//c2 ---> Car # 2 instance CP --> Car class
		Object c4=new Car(12345, "red", 500000);//c2 ---> Car # 2 instance CP --> Car class
		Object c5=new Car(12349, "white", 500000);//c
		System.out.println(c1.equals(c2));//false
		System.out.println(c1.equals(c3));//false
		System.out.println(c1.equals(c4));//true
		System.out.println(c1.equals(c5));//false
		
		
	

	}

}
