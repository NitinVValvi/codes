package jdbcdemo;
import java.sql.*;

public class A {
	public static void main(String[] args) throws Exception {
		String uname = "root";
		String pass = "root";
		//load the driver class
		Class.forName("com.mysql.jdbc.Driver");
		
		//establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",uname,pass);
		
		//construct the query
		String query = "insert into cjc values(4,'C',85000,'12:00:00')";
		
		//create the object of statement
		Statement st = con.createStatement();
		
		//Execute the query
		//st.execute(query);
		
		int count = st.executeUpdate(query);
		//close the connection
		System.out.println(count + " rows affected ");
		st.close();
		//rs.close();
		con.close();
		
		
		
	}
}
