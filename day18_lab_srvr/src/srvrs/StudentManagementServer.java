package srvrs;

import java.io.DataInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

import com.app.core.Student;
import com.app.core.Subject;

import static utils.CollectionUtils.populateMap;

public class StudentManagementServer {

	public static void main(String[] args) {
		// get populated student details
		HashMap<Integer, Student> map = populateMap();

		System.out.println("Waiting for clnt.....");
		try (// ss
				ServerSocket ss = new ServerSocket(4500);
				// accept cn from clnt
				Socket ds = ss.accept();
				// open o/p data strm Server app ----> OOS --->SOS --->Socket (sending resp to
				// clnt)
				ObjectOutputStream out = new ObjectOutputStream(ds.getOutputStream());
				// open i/p data strm Server app <---- DIS <---SIS <---Socket (for reading
				// request from clnt)
				DataInputStream in = new DataInputStream(ds.getInputStream())

		) {
			System.out.println("srvr : cn established n attached data strms: init phase successfully complete");
			boolean exit = false;
			while (!exit) {
				try {
					// read request : clnt sending string form of the subject
					System.out.println("Server waiting for clnt's next request...");
					Subject selectedSubject = Subject.valueOf(in.readUTF().toUpperCase());
					//valid subject
					//how to get list of students by subject ?
					ArrayList<Student> list=new ArrayList<>();
					for(Student s : map.values())
						if(s.getCurrentSubject().equals(selectedSubject))
							list.add(s);
					//populated or empty list ---simply send it to client
					out.writeObject(list);//serialization
					System.out.println("shutting down server.....");
					exit=true;
					
				} catch (Exception e) {
					out.writeObject("Server side Error " + e.getMessage() + " Pls retry!!!!");//serialization
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
