package jdbcdemo;
//DAO data access object
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDaoDemo 
{
	public static void main(String[] args) 
	{
		EmployeeDao dao = new EmployeeDao();
		//Employee e1 = dao.getEmployee(13);
		//System.out.println(e1.emp_name);
		Employee e2 = new Employee();
		e2.emp_id = 17;
		e2.emp_name ="Jayesh";
		dao.connect();
		dao.addEmployee(e2);
		
		dao.removeEmployee(13);
	}
}	
	class EmployeeDao
	{
		Connection con = null;
		public void connect()
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost/employee","root","password");
			} catch (Exception ex) 
			{
				System.out.println(ex);
			}
		}
		public Employee getEmployee(int emp_id) 
		{
			try {
				String query ="select emp_name from employee where emp_id ="+emp_id;
				Employee e = new Employee();
				e.emp_id = emp_id;
				//Class.forName("com.mysql.cj.jdbc.Driver");
				//con = DriverManager.getConnection("jdbc:mysql://localhost/employee","root","password");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query);
				
				rs.next();
				String name = rs.getString(1);
				e.emp_name = name;
				return e;
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
			return null;
			
			
		}
	
		public void addEmployee(Employee e)
		{
			String query = "insert into employee values (?,?)";
			try {
				PreparedStatement ps = con.prepareStatement(query);
				ps.setInt(1, e.emp_id);
				ps.setString(2, e.emp_name);
				ps.executeUpdate(); 
			} catch (Exception ex) 
			{
				System.out.println(ex);
			}
			
		}
		public void removeEmployee(int emp_id)
		{
			String query = "delete from employee where emp_id=?";
			try {
				PreparedStatement ps = con.prepareStatement(query);
				ps.setInt(1, emp_id);
				//ps.setString(2, emp_name);
				ps.executeUpdate();
				
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
			
		}
	}
	class Employee
	{

		int emp_id;
		String emp_name;
		
	}

