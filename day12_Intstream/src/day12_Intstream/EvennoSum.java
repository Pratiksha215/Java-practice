/*1. Display sum of all even nos between 1-100 .
(Hint : range & filter , sum() method of IntStream)*/

package day12_Intstream;
import java.util.stream.IntStream;

public class EvennoSum {
	 
    public static void main(String[] args) 
    { 
        int sumOfEvenno = IntStream.rangeClosed(1, 100) 
                           .filter(num -> num % 2 == 0) 
                           .sum();  
        System.out.println(sumOfEvenno); 
    } 

}
