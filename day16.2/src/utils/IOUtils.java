package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.app.core.Student;

public class IOUtils {
	public static void storeStudentDetails(ArrayList<Student> list, String fileName) throws IOException{
//Java app ---> PW ---> FW (text file)
		try(PrintWriter pw=new PrintWriter(new FileWriter(fileName)))
		{
	//		list.forEach(s -> pw.println(s));//lambda expr
			list.forEach(pw::println);//method ref.
		}
	}
}
