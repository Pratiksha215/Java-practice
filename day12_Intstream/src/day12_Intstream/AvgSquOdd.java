package day12_Intstream;

import java.util.stream.IntStream;

public class AvgSquOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double avgsquareoddno = IntStream.rangeClosed(10, 50) 
                .filter(p-> p% 2 !=0) 
                .map(p->p*p)
               .average()
               .getAsDouble(); 		
		System.out.println(avgsquareoddno);
	}

}
