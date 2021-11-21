package utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.app.core.Student;
import static java.time.LocalDate.*;
import static com.app.core.Subject.*;

public class BinIOUtils {
//add a static method to write 1 student details to bin file
	public static void saveStudentDetails(Student s, String fileName) throws IOException {
		// chain of strms JA --->DOS ---> BOS ---> FOS (Bin file)
		try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
			// write student info : int rollNo, String name, LocalDate dob, Subject
			// currentSubject, double gpa
			out.writeInt(s.getRollNo());// roll no
			out.writeUTF(s.getName());// name : UTF 8
			out.writeUTF(s.getDob().toString());// dob --> str --UTF8
			out.writeUTF(s.getCurrentSubject().toString());// subject ---> str --> UTF8
			out.writeDouble(s.getGpa());
		}
	}

	// add a static method to read 1 student details from bin file
	public static Student restoreStudentDetails(String fileName) throws IOException {
		// How to validate file : exists , file , read permission
		// Checked via java.io.File class : represents path to file or a folder
		// 1. Create file class instance
		// public File(String pathname)
		File f1 = new File(fileName);// f1 ---> path
		if (f1.exists() && f1.isFile() && f1.canRead()) {
			// readble data file exists
			// chain of strms : JA <---DIS<---BIS<-- FIS---Bin File

			try (DataInputStream in = new DataInputStream(
					new BufferedInputStream(new FileInputStream(fileName)))) {
				return new Student(in.readInt(), in.readUTF(), parse(in.readUTF()), valueOf(in.readUTF()),
						in.readDouble());
			}
		}
		return null;
	}

}
