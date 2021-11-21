package utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.time.LocalDate.parse;
import static utils.ValidateStudent.*;
import com.app.stud.Student;

public class BinaryIOutils 
{
	
	public static void saveBiData(Student stud, String filename) throws IOException
	{
		try(DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filename))))
		{
		dos.writeUTF(stud.getRollNo());
		dos.writeUTF(stud.getName());
		dos.writeUTF(stud.getDob().toString());
		dos.writeUTF(stud.getSubject().toString());
		dos.writeDouble(stud.getGpa());
		}
		
		System.out.println("Data Saved in Binary Format");
	}
	
	public static Student restoreBiData(String filename) throws FileNotFoundException, IOException
	{
		File fn=new File(filename);
		if(fn.exists() && fn.isFile() &&fn.canRead())
		{
			try(DataInputStream dis=new DataInputStream(new BufferedInputStream(new FileInputStream(fn))))
			{
				Student stud=new Student(dis.readUTF(),dis.readUTF(), parse(dis.readUTF()),parseNvalidate(dis.readUTF()),dis.readDouble());
				return stud;
			}
		}
		return null;
	}
	
}
