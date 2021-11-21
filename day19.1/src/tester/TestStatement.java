package tester;

import java.sql.*;
import static utils.DBUtils.getDBConnection;

public class TestStatement {

	public static void main(String[] args) {
		try (// cn
				Connection cn = getDBConnection();
				// st
				Statement st = cn.createStatement();
				// select : resultset
				ResultSet rst = st.executeQuery("select * from my_emp order by join_date");

		) {
			// rst cursor : before 1st row
			while (rst.next())
				System.out.printf("Emp ID %d Name %s Salary %.2f Join Date %s %n",
						rst.getInt(1), rst.getString(2),
						rst.getDouble(4), rst.getDate(6));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
