/*3.Create IntStream having ints in the range of 10...50
& Print its sum.
Hint( rangeClosed , sum)*/

package day12_Intstream;

import java.util.stream.IntStream;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        int sumofno = IntStream.rangeClosed(1, 100) 
	                              .sum();  
	        System.out.println(sumofno); 
	    } 

	}


