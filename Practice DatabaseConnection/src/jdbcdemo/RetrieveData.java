package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveData {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/b139";
		String uname = "root";
		String pass = "root";
		
		
		String query = "select roll_no,name,marks from student where marks >86";
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		String userdata = "";
		while(rs.next())
		{
			/*
			 * int roll_no = rs.getInt("roll_no"); String name = rs.getString("name"); float
			 * marks = rs.getFloat("marks");
			 */
		userdata = rs.getInt("roll_no")+" | "+rs.getString("name") +" | "+ rs.getFloat("marks");
			System.out.println(userdata);
			
			
		}
	}
}
