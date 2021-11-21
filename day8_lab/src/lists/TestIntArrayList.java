/*0. Create empty ArrayList of integers & populate it.(from array or user i/p via scanner)
Display the contents using : toString , for , forEach
1. check if a specific element exists in the list.
2. display index of 1st occurrence n last occurrence of the element
3. double values of element in the list --if elem val > 20
4. Create another ArrayList , to contain same elements as the 1st AL (arraylist)
     Display it (toString)
5. From 1st list : remove elem at the specified index
6. From 2nd list : remove all odd elements in the list
7. Sort the 1st list as per asc order.
8. Convert 2nd list into fixed size array.
*/
package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestIntArrayList {
	public static void main(String[] args) {
		// 0. Create empty ArrayList of integers & populate it.(from array or user i/p
		// via scanner)
		try (Scanner sc = new Scanner(System.in)) {
			// empty ArrayList
			ArrayList<Integer> l1 = new ArrayList<>();
			boolean exit = false;
			while (!exit) {
				System.out.println("Enter data::");
				int data = sc.nextInt();
				if (data == 999)
					exit = true;
				else
					l1.add(data);
			}
			// Display the contents using : toString
			System.out.println("AL via toString" + l1);
			// Display the contents using : for
			System.out.println("AL via for loop");
			for (int i = 0; i < l1.size(); i++)
				System.out.println(l1.get(i) + " ");
			// Display the contents using : for-each
			System.out.println("AL via for-each loop");
			for (int i : l1)// any implicit conversion : auto un boxing(Integer-->int)
				System.out.println(i + " ");

			// 1. check if a specific element exists in the list.
			System.out.println("Enter data to search");
			System.out.println(l1.contains(sc.nextInt()) ? "Present" : "Absent");

			// 2. display index of 1st occurrence n last occurrence of the element
			System.out.println("Enter search key to find its 1st n last occurrence");
			int data = sc.nextInt();
			System.out.println("1st occurrence" + l1.indexOf(data) + "last occurrence" + l1.lastIndexOf(data));

			// 3. double values of element in the list --if elem val > 20
			for (int i = 0; i < l1.size(); i++)
				if (l1.get(i) > 20)
					System.out.println("Replaced" + l1.set(i, l1.get(i) * 2));
			System.out.println("AL after replace" + l1);

			// 4. Create another ArrayList , to contain same elements as the 1st AL
			// (arraylist)
			ArrayList<Integer> l2 = new ArrayList<Integer>();
			l2.addAll(l1);
			System.out.println("AL l2 via toString" + l2);

			// 5. From 1st list : remove elem at the specified index
			System.out.println("ArrayList before remove:" + l1);
			l1.remove(0);
			l1.remove(2);// it removes 2nd index element from the remaining list
			System.out.println("ArrayList after remove:" + l1);

			// 6. From 2nd list : remove all odd elements in the list
			for(int i=0;i<l2.size();i++)
				if((l2.get(i))%2!=0){
					l2.remove(i);
					i--;
					System.out.println("ArrayList after removing all odd elements:" + l2);
				}

			// 7. Sort the 1st list as per asc order.
			Collections.sort(l1);
			System.out.println("Sorted ArrayList in Ascending order : " + l1);
			
			//8. Convert 2nd list into fixed size array.
			Object[] objects = l2.toArray(); 
			System.out.println("Array of list l2 is : ");
	        // Printing array of objects 
	        for (Object obj : objects) 
	        	 System.out.print(obj + " "); 
					
			
		    }
		

	}

}
