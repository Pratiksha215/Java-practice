package tester;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDBConnection {

	public static void main(String[] args) {
		try {
			// loads JDBC Driver class in JVM's method area : optional in Java SE
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/test?useSSL=false";
			//establish DB connection
			try(Connection cn=DriverManager.getConnection(url, "root", "root"))
			{
				System.out.println("Connected to DB "+cn);//toString of DB conn impl class
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
