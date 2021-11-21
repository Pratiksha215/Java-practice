package srvrs;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args) {
		System.out.println("Waiting for client connection");
		try (
				// bind SS to a server side free port
				ServerSocket ss = new ServerSocket(5000);
				// accept connection from client
				Socket ds = ss.accept();// blocking method. Rets data socket instance in case of success.
		) {
			System.out.println("Accepted connection from client IP " 
		+ ds.getInetAddress().getHostName() + " Clnt port "
					+ ds.getPort() + " server port " + ds.getLocalPort());
			try(DataOutputStream out=new DataOutputStream(ds.getOutputStream());
					DataInputStream in=new DataInputStream(ds.getInputStream()))
			{
				System.out.println("srvr : attached data strms");
				//read rquest
				String requestMesg=in.readUTF();
				System.out.println("Clnt sent request "+requestMesg);
				//send response
				out.writeUTF(requestMesg.toUpperCase());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
