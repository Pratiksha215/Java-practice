package utils;
import static com.app.stud.Subject.AWP;
import static com.app.stud.Subject.DBT;
import static com.app.stud.Subject.JAVA;
import static com.app.stud.Subject.OS;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.app.stud.Student;
public class StudCollectionUtils 
{
	public static HashMap<String, Student> populateData()
	{
		HashMap<String,Student> hashMap=new HashMap<>();
		hashMap.putIfAbsent("101",new Student("101","Maya",parse("1998-05-06"),JAVA,7.8 ));
		hashMap.putIfAbsent("102",new Student("102","Kunal",parse("1997-10-11"),DBT,8.4 ));
		hashMap.putIfAbsent("103",new Student("103","Amit",parse("1997-07-29"),OS,6.5 ));
		hashMap.putIfAbsent("104",new Student("104","Shubham",parse("1998-04-21"),JAVA,8.7 ));
		hashMap.putIfAbsent("105",new Student("105","Trupti",parse("1998-06-07"),JAVA,7.5 ));
		hashMap.putIfAbsent("106",new Student("106","Jeet",parse("1996-09-23"),AWP,8.2 ));
		hashMap.putIfAbsent("107",new Student("107","Pallavi",parse("1996-05-17"),OS,7.1 ));
		
				
			hashMap.get("101").setAddress("Andheri","Maharashtra","India");
			hashMap.get("102").setAddress("South Carolina","Columbia","Usa");
			hashMap.get("103").setAddress("Dombivli","Maharashtra","India");
			hashMap.get("104").setAddress("Mussoorie","Uttarakhand","India");
			hashMap.get("105").setAddress("Panji","Goa","India");
			hashMap.get("106").setAddress("Chandigarh","Punjab","India");
			hashMap.get("107").setAddress("Thane","Maharashtra","India");
			
			
		return hashMap;
	}
	
	public static List<Student> populateList()
	{
		ArrayList<Student> arraylist=new ArrayList<Student>();
		arraylist.add(new Student("101","Maya",parse("1998-05-06"),JAVA,7.8 ));
		arraylist.add(new Student("102","Kunal",parse("1997-10-11"),DBT,8.4 ));
		arraylist.add(new Student("103","Amit",parse("1997-07-29"),OS,6.5 ));
		arraylist.add(new Student("104","Shubham",parse("1998-04-21"),JAVA,8.7 ));
		arraylist.add(new Student("105","Trupti",parse("1998-06-07"),JAVA,7.5 ));
		arraylist.add(new Student("106","Jeet",parse("1996-09-23"),AWP,8.2 ));
		arraylist.add(new Student("107","Pallavi",parse("1996-05-17"),OS,7.1 ));
		arraylist.add(new Student("108","Rohit",parse("1996-10-31"),OS,4.9 ));
		arraylist.add(new Student("109","Jay",parse("1998-07-11"),AWP,3.6 ));
		arraylist.add(new Student("110","Himanshi",parse("1996-01-14"),OS,1.58 ));
		arraylist.add(new Student("111","Tejas",parse("1996-06-17"),JAVA,4.5 ));
		arraylist.add(new Student("112","Neha",parse("1996-11-04"),OS,2 ));
		
		arraylist.get(0).setAddress("Andheri","Maharashtra","India");
		arraylist.get(1).setAddress("South Carolina","Columbia","Usa");
		arraylist.get(2).setAddress("Dombivli","Maharashtra","India");
		arraylist.get(3).setAddress("Mussoorie","Uttarakhand","India");
		arraylist.get(4).setAddress("Panji","Goa","India");
		arraylist.get(5).setAddress("Chandigarh","Punjab","India");
		arraylist.get(6).setAddress("Vikroli","Maharashtra","India");
		arraylist.get(7).setAddress("Dalhousie","Jammu Kashimr","India");
		arraylist.get(8).setAddress("Manglore","Karnatka","India");
		arraylist.get(9).setAddress("Kalyan","Maharashtra","India");
		arraylist.get(10).setAddress("Solapur","Maharashtra","India");
		arraylist.get(11).setAddress("Noida","UttarPradesh","India");
		
		return arraylist;
	}
	
	
	
	
}
