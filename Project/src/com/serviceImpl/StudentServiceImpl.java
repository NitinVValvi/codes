package com.serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.model.Student;

public class StudentServiceImpl {
	String url = "jdbc:mysql://localhost:3306/test";
	String user = "root";
	String password ="root";
	Scanner sc = new Scanner(System.in);
	Student s = new Student();
	public void create()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			String sql = "create table studentdata (rollno int primary key, name varchar(30), college varchar(50),address varchar(40))";
			Statement st = con.createStatement();
			st.execute(sql);
			System.out.println("Table created Successfully");
			con.close();
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void insert() 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.print("Enter your rollno: ");
			s.setRoll_no(sc.nextInt());
			System.out.println("Enter your Name: ");
			s.setName(sc.next());
			System.out.println("Enter your College Name: ");
			s.setCollege(sc.next());
			System.out.println("Enter your Address");
			s.setAddress(sc.next());
			String sql = "insert into studentdata values (?,?,?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, s.getRoll_no());
			st.setString(2,s.getName());
			st.setString(3,s.getCollege() );
			st.setString(4, s.getAddress());
			st.executeUpdate();
			System.out.println("Data Inserted");
			con.close();
			st.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	public void update()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String sql = "update studentdata set name = (?) where rollno =(?)";
			Connection con = DriverManager.getConnection(url, user, password);
			
			System.out.println("Enter Roll no to update : ");
			int rollno = sc.nextInt();
			System.out.println("Enter the name to update : ");
			String name = sc.next();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, rollno);
			pst.setString(2, name);
			pst.executeUpdate();
			System.out.println("Data Updated Successfully");
			con.close();
			pst.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void delete()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			String sql = "delete from studentdata where rollno= (?)";
			System.out.println("Enter the rollno to delete data: ");
			s.setRoll_no(sc.nextInt());
			
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, s.getRoll_no());
			
			st.executeUpdate();
			con.close();
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void select()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			String sql = "select * from studentdata";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			String data ="";
			while(rs.next())
			{
				data = rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4);
				System.out.println(data);
			}
			con.close();
			st.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
}
