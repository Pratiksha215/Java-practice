package clnts;

import java.util.ArrayList;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Scanner;

import com.app.core.Student;

public class StudentManagementClnt {

	@SuppressWarnings( "unchecked" )
	public static void main(String[] args) {
		System.out.println("Enter server IP n port no");
		try (Scanner sc = new Scanner(System.in);
				// create socket cls instance to establish connection with server
				Socket s1 = new Socket(sc.next(), sc.nextInt());
				// attach suitable data strms
				// clnt app ---> DOS ---> SOS --> socket
				DataOutputStream out = new DataOutputStream(s1.getOutputStream());
				// clnt app <---- OIS <---- SIS <--- socket
				ObjectInputStream in = new ObjectInputStream(s1.getInputStream())) {
			System.out.println("clnt : connected to srvr n attached data strms");
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("Enter subject , to fetch list of students from server");
					// send subject in string form
					out.writeUTF(sc.next());
					System.out.println("clnt : Awiting response");
					// System.out.println(in.readObject());// de serialization
					Object o = in.readObject();
					if (o instanceof String) {
						System.out.println(o);
					} else {
						ArrayList<Student> list = (ArrayList<Student>) o;
						System.out.println("List of students ");
						list.forEach(System.out::println);
						exit = true;
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
