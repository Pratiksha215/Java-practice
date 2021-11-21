package utils;

import static com.app.core.Subject.valueOf;
import static java.time.LocalDate.parse;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.app.core.Student;

public class BinIOUtils {
//add a static method to write 1 student details to bin file
	public static void saveStudentDetails(Student s, String fileName) throws IOException {
		// chain of strms JA --->OOS ---> ---> FOS (Bin file)
		try (ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName))) {
		// write student info : int rollNo, String name, LocalDate dob, Subject
			// currentSubject, double gpa : using single write operation
			out.writeObject(s);//serilalization : exc
			
		}
	}
	public static void saveStudentMapDetails(HashMap<Integer, Student> map, String fileName) throws IOException {
		// chain of strms JA --->OOS ---> ---> FOS (Bin file)
		try (ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName))) {
		// write map of students
			out.writeObject(map);//JVM checks for serializability of the entire obj graph : if it encounters 
			//any non serializable node : entire ser. fails : java.io.NotSerializableExc 
			
		}
	}

	// add a static method to read map of students  from bin file
	@SuppressWarnings("unchecked")
	public static HashMap<Integer, Student> restoreStudentDetails(String fileName) throws IOException, ClassNotFoundException {
		// How to validate file : exists , file , read permission
		// Checked via java.io.File class : represents path to file or a folder
		// 1. Create file class instance
		// public File(String pathname)
		File f1 = new File(fileName);// f1 ---> path
		if (f1.exists() && f1.isFile() && f1.canRead()) {
			// readable data file exists
			// chain of strms : JA <---OIS <-- FIS---Bin File

			try (ObjectInputStream in=new ObjectInputStream(new FileInputStream(fileName))){
				return (HashMap<Integer, Student>)in.readObject();//de serialization
			}
		}
		//In case if file doesn't exist : return empty map
		return new HashMap<>();
	}

}
