package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Employee_CRUD {

	String url = "jdbc:mysql://localhost:3306/b139";
	String user = "root";
	String password = "root";
	Scanner sc = new Scanner(System.in);

	public void create() {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			String sqlquery = "create table employee (eid int primary key, ename varchar(50),addr varchar(50),mobno varchar(50),designation varchar(50), email varchar(350))";

			Connection con = DriverManager.getConnection(url, user, password);
			
			Statement st = con.createStatement();
			st.execute(sqlquery);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void delete() {
		// TODO Auto-generated method stub
		
	}
	private void update() {
		// TODO Auto-generated method stub
		
	}
	private void retrieve() {
		// TODO Auto-generated method stub
		
	}
	private void insert() {
		try {
			System.out.println("ENTER Employee Id : ");
			int eid = sc.nextInt();
			System.out.println("Enter Employee Name: ");
			String ename =sc.next();
			
			System.out.println("Enter Employee address: ");
			String addr = sc.next();
			System.out.println("Enter Employee mobileno: ");
			long mobno = sc.nextLong();
			System.out.println("Enter Employee designation: ");
			String designation = sc.next();
			
			System.out.println("Enter Employee email: ");
			String email = sc.next();
			Class.forName("com.mysql.jdbc.Driver");
			String sql = "insert into employee  values (?,?,?,?,?,?)";
			Connection con = DriverManager.getConnection(url,user,password);
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, eid);
			ps.setString(2, ename);
			ps.setString(3, addr);
			ps.setLong(4, mobno);
			ps.setString(5, designation);
			ps.setString(6, email);
			
			ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Employee_CRUD ec = new Employee_CRUD() ;
		Scanner sc = new Scanner(System.in);
		while(true) 
		{
		System.out.println("Enter the choice: \n"+"Choice 1 create table \n"+"Choice 2 insert data\n"+"Choice 3 to retrieve\n"+"Choice 4 to update\n"+"choice 5 to delete\n"+"Choice 6 to exit! ");
		int no = sc.nextInt();
			switch(no)
			{
				case 1 : ec.create();
				break;
				case 2 : ec.insert();
				break;
				case 3 : ec.retrieve();
				break;
				case 4 : ec.update();
				break;
				case 5 : ec.delete();
				break;
				case 6 :System.out.println("Exit");
				return;
			}
		}
	}

}
