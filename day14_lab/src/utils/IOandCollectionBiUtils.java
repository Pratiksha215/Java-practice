package utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.app.stud.Student;

public class IOandCollectionBiUtils 
{
	public static void saveObjectData(Student stud,String filename) throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filename))))
		{
			oos.writeObject(stud);
		}
		
		System.out.println("Data Stored");
		
	}
	
	public static Student restoreObjectData(String filename) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		File fn1=new File(filename);
		if(fn1.exists() && fn1.isFile() && fn1.canRead())
		{
		try(ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename))))
		{
			return (Student)ois.readObject();
		}
		}
		return null;
	}
	
	public static void saveMapData(HashMap<String,Student> map,String filename) throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream out=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filename))))
		{
			out.writeObject(map);
		}
		
		System.out.println("Data Saved Successfully");
	}
	
	public static HashMap<String,Student> restoreMapData(String filename) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		File fn2=new File(filename);
		if(fn2. exists() &&  fn2.isFile() && fn2.canRead())
		{
		try(ObjectInputStream in=new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename))))
		{
			return (HashMap<String,Student>)in.readObject();
		}
		}
		return new HashMap<>();
	}
}
