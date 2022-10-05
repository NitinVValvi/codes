package jdbcdemo;
import java.sql.*;
//java Database Connectivity
/*
 * 1.import --> java.sql 
 * 2.load and register --> com.mysql.jdbc.Driver
 * 3.create  connection --> Connection object 
 * 4.create a statement --> Statement object
 * 5.execute the query -->
 * 6.process the results
 * 7.close
 */
import java.util.Scanner;
 
public class Demo {
	public static void main(String[] args) throws Exception  
	{
		String url = "jdbc:mysql://localhost:3306/b139";
		String uname= "root";
		String pass ="root";
		//int roll_no = 18;
		//String name = "Vishal";
		//float marks = 87;
		
		//String query = "select sname from student where rollno=3";
		//String query = "insert into student values (4,'Sumit')";
		String query = "insert into student values (?,?,?)";
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con = DriverManager.getConnection(url,uname,pass); 
		//Statement st = con.createStatement();
		
		/*PreparedStatement means whenever you want to work with predefined queries
		 * you can see the query is fixed but the value will keep changing
		 * so we use PreparedStatement
		 * */
		//PreparedStatement
		//ResultSet rs = st.executeQuery(query); //DDL, DML, DQL
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the batch id");
		int bid = sc.nextInt();
		System.out.println("enter the batch name");
		String bname = sc.next();
		System.out.println("enter the batch fee");
		float bfee = sc.nextFloat();
		//System.out.println("batch time");
		
		
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, bid);
		ps.setString(2,bname);
		ps.setFloat(3, bfee);
	//	ps.setTime(4,time );
		
		//int count = ps.executeUpdate(query);
		int count = ps.executeUpdate();
	/*	String userdata = "";
		while(rs.next()) {
		//String name = rs.getString(2);
		//int rollno = rs.getInt("rollno");
		//System.out.println(rollno);
		userdata = rs.getInt(1)+ " : "+rs.getString(2);
		System.out.println(userdata);
		}
		*/
		System.out.println(count+ " rows affected ");
		ps.close();
		con.close();
		sc.close();
	
	
	}
}
