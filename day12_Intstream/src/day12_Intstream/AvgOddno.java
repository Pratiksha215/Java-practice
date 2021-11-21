package day12_Intstream;
import java.util.stream.IntStream;

public class AvgOddno {

	public static void main(String[] args) {
		double avgoddno = IntStream.rangeClosed(10, 50) 
                .filter(num -> num % 2 !=0) 
               .average()
               .getAsDouble(); 		
		System.out.println(avgoddno);
}
}
