package tester;

import static utils.DBUtils.getDBConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Scanner;

import java.sql.ResultSet;

public class TestPST {

	public static void main(String[] args) {
		String sql="select empid,name,salary from my_emp where join_date > ? and salary between ? and ?";
		try(Scanner sc=new Scanner(System.in);
				//cn : 1 time
				Connection cn=getDBConnection();
				//pst 1 time
				PreparedStatement pst=cn.prepareStatement(sql);
				
				
				)
		{
			//set IN params
			System.out.println("Enter join date(yr-mon-day) , lower n upper sal limits");
			//string --> java.sql.Date
			//Date class API : public static Date valueOf(String s) throws IllegalArgumentExc
			pst.setDate(1, Date.valueOf(sc.next()));//join date 
			pst.setDouble(2, sc.nextDouble());//lower lim
			pst.setDouble(3, sc.nextDouble());//upper lim
			//exec : execQuery
			try(ResultSet rst=pst.executeQuery())
			{
				while(rst.next())
					System.out.printf("Emp ID %d Name %s Salary %.1f %n",
							rst.getInt(1),rst.getString(2),rst.getDouble(3));
			}
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
