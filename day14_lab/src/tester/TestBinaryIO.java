package tester;

import java.io.IOException;
import java.util.Scanner;

import com.app.stud.Student;
import  static com.app.stud.Subject.*;
import static java.time.LocalDate.parse;
import static utils.BinaryIOutils.*;

public class TestBinaryIO {

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter the name of the file in which data uis to be saved");
			String filename1=sc.nextLine();
			
			Student st1=new Student("114","Tee",parse("1995-04-16"),JAVA,7.6);
			Student st2=new Student("117","Kimmon",parse("1991-04-08"),AWP,8.9);
			
			saveBiData(st1,filename1);
			saveBiData(st2, filename1);
			
			System.out.println("Data Saved");
			
			
			System.out.println("Enter the file from which data needs to be restored");
			String filename2=sc.nextLine();
			Student st=restoreBiData(filename2);
			System.out.println("Restored data :: \n"+st);
			
			saveBiData(st1, filename2);
			st=restoreBiData(filename2);
			System.out.println("Restored  data:: \n"+st);
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
