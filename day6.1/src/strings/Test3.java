package strings;

public class Test3 {

	public static void main(String[] args) {
		String s1="Hello";
		String s2=new String("Hello");
		String s3="HELLO";
		String s4="hello";
		String s5="Hello";
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3));//false
		System.out.println(s1==s4);//false
		System.out.println(s1.equals(s4));//false
		System.out.println(s1.equalsIgnoreCase(s3));//true
		System.out.println(s1==s5);//true
		System.out.println(s1.equals(s5));//true

	}

}
