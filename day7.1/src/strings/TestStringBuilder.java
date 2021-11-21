package strings;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello hi");
		System.out.println("Contents "+sb);
		System.out.println("len="+sb.length()+" capa "+sb.capacity());
		StringBuilder sb2=sb.append(123.456);
		System.out.println(sb);
		System.out.println(sb2);
		System.out.println(sb==sb2);//true
		sb.append('c').append(true).append(23.45f).append("testing1234");
		System.out.println(sb);
		sb.reverse();
		System.out.println("reversed SB "+sb);
		sb.delete(0, sb.length());
		System.out.println("SB contents:"+sb);
		System.out.println(sb.length()+" "+sb.capacity());
		sb.trimToSize();
		System.out.println(sb.length()+" "+sb.capacity());
		

	}

}
