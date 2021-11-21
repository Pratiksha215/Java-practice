package tester;

import com.app.stud.Student;
import static java.time.LocalDate.parse;
import static utils.IOandCollectionBiUtils.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import static utils.StudCollectionUtils.*;
import static com.app.stud.Subject.*;

public class TestObjectBinaryIO {

	public static void main(String[] args) 
	{
		HashMap<String,Student> map=populateData();
		
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter the name of file in which records need to be saved");
			String filename1=sc.nextLine();
			
			Student st=new Student("115","Copter",parse("1997-01-27"),DBT, 7.7);
			st.setAddress("Los Angelas","California", "USA");
			
			 saveObjectData(st, filename1);
			 
			 System.out.println("Enter the name of file in which records need to be saved");
			String filename2=sc.nextLine();
			
			System.out.println("Restored data:: \n"+restoreObjectData(filename2));
			
			
			System.out.println("Enetr the name of file to be saved");
			String filename3=sc.nextLine();
			saveMapData(map, filename3);
			System.out.println("Data Stored");
			
			System.out.println("Enter the name of file from which data is restored");
			String filename4=sc.nextLine();
			System.out.println("Restored Data:: \n"+restoreMapData(filename4));
			
			saveMapData(map, filename4);
			
			System.out.println("Restored Data:: \n");
			HashMap<String,Student> hm=restoreMapData(filename4);
			hm.forEach((k,v)->System.out.println("data"+v));
	
	
		} 
		catch (Exception e) {
		
			e.printStackTrace();
		} 
		}
		
	}


