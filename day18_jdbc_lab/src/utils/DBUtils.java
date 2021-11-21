package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
//add a static method to return DB connection instance
	public static Connection getDBConnection() throws ClassNotFoundException,SQLException
	{
		String url="jdbc:mysql://localhost:3306";
		//load JDBC driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url,"pratiksha", "ganpati");
	}
}
