package utils;
import java.io.*;
import java.util.HashMap;

import com.app.stud.*;
public class IOutils 
{
	public static void saveData(HashMap<String,Student> map,String filename)throws IOException
	{
		try(PrintWriter pw=new PrintWriter(new FileWriter(filename,true)))
		{
			for(Student s:map.values())
			{
				pw.println(s+"\n");
			}
		}
	}
}
