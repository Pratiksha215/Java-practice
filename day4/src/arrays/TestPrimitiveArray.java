/*
Objective -- Accept no of data samples(of type double) from User(using scanner)
Create suitable array & display it using for-loop , to confirm default values.

Accept data from User(scanner) & store it in the array.
Display array data using  for loop.
Display array data using for-each loop

*/
package arrays;
import java.util.Scanner;
class TestPrimitiveArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Loaded class for scanner "+sc.getClass().getName());
		System.out.println("How many data samples ?");
		double[] data;//ref : array type of a ref var : method local var : stack : as per JVM's spec 4/8/16 are mem allocated.
	//	System.out.println(data); javac error : can't access un inited var
	    data=new double[sc.nextInt()];
		 System.out.println("Def contents of array");
		for(int i=0;i<data.length;i++)
         System.out.print(data[i]+" ");
		 System.out.println();
		 System.out.println("Name of the loaded class for array "+data.getClass().getName());
		//Accept data from User(scanner) & store it in the array.
		for(int i =0;i<data.length;i++)
		{
			System.out.println("Enter array data");
			data[i]=sc.nextDouble();
		}
		 System.out.println("Inited contents of array");
		for(int i=0;i<data.length;i++)
         System.out.print(data[i]+" ");

		sc.close();
	}
}
