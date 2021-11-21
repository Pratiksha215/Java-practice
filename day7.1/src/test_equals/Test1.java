package test_equals;

public class Test1 {

	public static void main(String[] args) {
		Car c1=new Car(12345, "red", 500000);//c1 ---> Car #1 instance CP ---> Car class
		Car c2=new Car(12345, "red", 500000);//c2 ---> Car # 2 instance CP --> Car class
		Car c3=c1;
		System.out.println(c1.equals(c2));//false (Object's equals) : ref equality ---true
		System.out.println(c1==c2);//false : ref equality
		System.out.println(c1.equals(c3));//true
		System.out.println(c1==c3);//true
		System.out.println(c1.hashCode() +" "+c2.hashCode()+" "+c3.hashCode());

	}

}
