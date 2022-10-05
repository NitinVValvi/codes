package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dem {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/b139";
		String uname = "root";
		String pass = "root";
		String query = "select name from student where roll_no = 3 ";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		String name = rs.getString("name");
		
		System.out.println(name);
		st.close();
		con.close();
	}
}
