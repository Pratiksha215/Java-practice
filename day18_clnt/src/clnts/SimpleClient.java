package clnts;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SimpleClient {

	public static void main(String[] args) {
		System.out.println("Enter server IP n server port no");
		try(Scanner sc=new Scanner(System.in);
				Socket s1=new Socket(sc.next(), sc.nextInt())
				)
		{
			System.out.println("Connected to Server IP "
		+s1.getInetAddress().getHostName()+" server port no "+s1.getPort()
		+"clnt local port  "+s1.getLocalPort());
			//attach suitable data strms
			//Java app ----> DOS --> SOS ---> socket device
			//Java app <-----DIS <----SIS <---- socket device
			try(DataOutputStream out=new DataOutputStream(s1.getOutputStream());
					DataInputStream in=new DataInputStream(s1.getInputStream()))
			{
				System.out.println("attached data strms....");
				//send request mesg to server
				out.writeUTF("Hello Server , how are u??????????");
				//display resp from server
				System.out.println("Response from server : "+in.readUTF());
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
