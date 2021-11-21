package lists;

import java.util.ArrayList;

public class IntegerList {

	public static void main(String[] args) {
		// create EMPTY ArrayList to store integer type of refs.
		ArrayList<Integer> integerList=new ArrayList<>();
		System.out.println("size "+integerList.size());
		int[] data= {34,12,3,4,5,10,12,34,-67,100,34,678,99,101};//sample data
		//how to populate AL from sample data.
		//for / for-each
		for(int i : data)//i=data[0].....i=data[data.length-1]
			integerList.add(i);//javac : auto boxing : integerList.add(new Integer(i));
		integerList.add(4, null);
		System.out.println("List contents "+integerList);//AL's toString
		System.out.println("size "+integerList.size());
		
		

	}

}
