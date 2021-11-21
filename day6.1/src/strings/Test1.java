package strings;

public class Test1 {

	public static void main(String[] args) {
		String s1="hello";//literal 
		s1=s1.concat("hi");
		String s2=s1.toUpperCase();
		System.out.println(s2);//HELLOHI
		String s3=s2.replace('L', 'T');
		System.out.println(s3);//HETTOHI
		System.out.println(s1);//hellohi
		
		

	}

}
