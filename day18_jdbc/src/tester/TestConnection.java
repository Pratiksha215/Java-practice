package tester;

import static utils.DBUtils.getDBConnection;

import java.sql.Connection;

public class TestConnection {

	public static void main(String[] args) {
		try (Connection cn = getDBConnection()) {
			System.out.println("db connection established....");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
