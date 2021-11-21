package date_handling;

import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		Date curntDate=new Date();
		System.out.println(curntDate);
		Date epochDate=new Date(0);
		System.out.println(epochDate);
		System.out.println(curntDate.before(epochDate));//false
		System.out.println(curntDate.compareTo(epochDate));//+ve : 1
		System.out.println(curntDate.equals(epochDate));//false

	}

}
