package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
//add a static method to ret DB connection to the caller
	public static Connection getDBConnection() throws ClassNotFoundException,SQLException{
//		Class.forName("com.mysql.cj.jdbc.Driver");//is optional is Java SE
		String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
		return DriverManager.getConnection(url, "root", "root");
	}
}
