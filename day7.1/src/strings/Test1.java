package strings;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		String s="Hello , how are u?";
		System.out.println(s.charAt(s.length()-1));
		String s1="Hello";
		String s2=s1.toUpperCase();//HELLO
		System.out.println(s1.compareTo(s2));//+ve value
		int ch='e';
		int ch1='E';
		System.out.printf("%d %d%n",ch,ch1);
		//search for a keyword
		String key="java";
		String ss="string in java are cool stringbuilder is for mutable string!!!!!!";
		System.out.println(ss.contains(key));//true
		System.out.println(ss.startsWith("strings")+" "+ss.endsWith("!!!!"));
		System.out.println(ss.substring(2, 7));//ring 
		String test="abc:def:12345:fdgsdf:345";
		String[] tokens=test.split(":");
		//how to display these tokens ? : w/o any loop : Arrays.toString
		System.out.println(tokens);//hashcode value of array object
		System.out.println("Tokens ");
		System.out.println(Arrays.toString(tokens));
		System.out.println(ss.indexOf("string")+" "+ss.lastIndexOf("string"));
		
		
				
	}
}
