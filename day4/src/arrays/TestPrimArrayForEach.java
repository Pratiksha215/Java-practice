/*
Objective -- Accept no of data samples(of type double) from User(using scanner)
Create suitable array & display it using for-loop , to confirm default values.

Accept data from User(scanner) & store it in the array.
Display array data using  for loop.
Display array data using for-each loop

*/
package arrays;
import java.util.Scanner;
import java.util.Arrays;

class TestPrimArrayForEach
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many data samples ?");
		double[] data=new double[sc.nextInt()];//4
		 System.out.println("Default contents of array");
		for(double d : data)
         System.out.print(d+" ");
		 System.out.println();
		 System.out.println("Name of the loaded class for array "+data.getClass().getName());
		//Accept data from User(scanner) & store it in the array.
		for(int i =0;i<data.length;i++)
		{
			System.out.println("Enter array data");//1 2 3 4
			data[i]=sc.nextDouble();
		}
		 
		 for(double d : data)//d=data[0]
		{
          d *= 2 ;//doubled the values
			System.out.print(d+" ");
		}
		 System.out.println();
		 System.out.println("What will be o/p ?");
		 for(double d : data)
          System.out.print(d+" ");
		 //display array data  : for / for-each / using java.util.Arrays :
		 //public static String toString(double[] d)
	     System.out.println();
		 System.out.println("Array contents via toString "+Arrays.toString(data));
		

		sc.close();
	}
}
