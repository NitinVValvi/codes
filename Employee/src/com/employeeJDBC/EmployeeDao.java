package com.employeeJDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeDao {
	Scanner sc = new Scanner(System.in);
	Connection con = null;
	
	Employee e = new Employee();
	public void connect()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		} catch (Exception ex) 
		{
			System.out.println(ex);
		}
	}
	public void addEmployee()
	{
		try
		{
			System.out.println("Enter the emp id:");
			e.setEmpid(sc.nextInt());
			System.out.println("Enter the employee name: ");
			e.setEname(sc.next());
			System.out.println("Enter the employee email: ");
			e.setEmail(sc.next());
			System.out.println("Enter the employee Address: ");
			e.setAddress(sc.next());
			System.out.println("Enter the employee password: ");
			e.setPass(sc.next());
			CallableStatement cs = con.prepareCall("{call employeedata(?,?,?,?,?)}");
			cs.setInt(1, e.getEmpid());
			cs.setString(2, e.getEname());
			cs.setString(3, e.getEmail());
			cs.setString(4,e.getAddress());
			cs.setString(5,e.getPass());
			cs.execute();
			System.out.println("data enter succesfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void selectEmployee()
	{
		try
		{
		CallableStatement cs = con.prepareCall("{call selectemployeedata()}");
	
		ResultSet rs = cs.executeQuery();
		
		String data = "";
		while(rs.next())
		{
			data = rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5);
			System.out.println(data);
		}
		//return e;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//return null;
	}
	public void updateEmployee()
	{
		try {
			CallableStatement cs = con.prepareCall("{call updateempdata(?,?,?)}");
			cs.setInt(1, 2);
			cs.setString(2, "rahulaher@gmail.com");
			cs.setString(3, "Pune");
			cs.executeUpdate();
			System.out.println("data updated");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void deleteEmployee()
	{
		
	}
}
