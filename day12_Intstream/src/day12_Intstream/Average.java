/*4.Print avg of 10-50 numbers
(rangeClosed,average & optional)*/

package day12_Intstream;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream stream = IntStream.rangeClosed(10, 50);
		OptionalDouble obj = stream.average();
		System.out.println(obj.getAsDouble());
	}

}
