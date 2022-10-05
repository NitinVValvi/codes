package com.braindata.bankmanagement.serviceImpl;
import com.braindata.bankmanagement.model.Account.Account;
import com.braindata.bankmanagement.service.RBI;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.regex.Pattern;
public class SBI implements RBI
{
	Scanner sc = new Scanner(System.in);
	Account a = new Account();
	double balance;
	String url = "jdbc:mysql://localhost:3306/bmsproject";
	String user = "root";
	String password ="root";
	public void createAccount()
	{
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con	= DriverManager.getConnection(url, user, password);
		String sql = " INSERT INTO bankaccount1 (acc_no,acc_name,mob_no,addhar_no,gender,age,balance) values (?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		do
		{
		System.out.println("Enter the Account No: ");
			int n = sc.nextInt();
			a.setAccNo(n);
			ps.setInt(1, a.getAccNo());
		}while(a.getAccNo()==0);
		
		
		while(a.getName()==null)
		{
			System.out.println("Enter the account name: ");
			String name = sc.next();
			
			boolean match = Pattern.matches("^[A-Z]{1}[a-z]{1,5}",name);
			if(match)
			{
				a.setName(name);
				ps.setString(2, a.getName());
				System.out.println("name is valid");
				
			}	
			else
			{
				System.out.println("Enter the valid name");
			}
		}
		
		
		
		while(a.getMobNo()==null)
		{
			System.out.println("Enter mobile number: ");
			String mob = sc.next();
			boolean match = Pattern.matches("^[7-9]{1}[0-9]{9}", mob);
			if(match)
			{
				a.setMobNo(mob);
				ps.setString(3, a.getMobNo());
				System.out.println("Mobile number pattern is right");
				
			}
			else
			{
				System.out.println("Mobile number pattern is wrong");
				
			}
		}
		
		do 
		{
		System.out.println("Adhar number: ");
		String adhar = sc.next();
		boolean match = Pattern.matches("[0-9]{4}[0-9]{4}[0-9]{4}", adhar);
			if(match)
			{
				a.setAdharNo(adhar);
				System.out.println("Adhar pattern is valid");
				ps.setString(4, a.getAdharNo());
			}
			else 
			{
				System.out.println("Enter the correct pattern");
			}
		}
		while(a.getAdharNo()==null);
		
		do
		{
			System.out.println("Enter Gender: ");
			String gender = sc.next();
			/*
			 * boolean match = Pattern.matches("[M]{1}[a-z]{3}||^[F]{1}[a-z]{5}||^[a-z]{5}",
			 * gender); if(match) { a.setGender(gender); System.out.println("its male"); }
			 * else if(match==false) { a.setGender(gender);
			 * System.out.println("its female"); } else { a.setGender(gender);
			 * System.out.println("its other"); }
			 */
			a.setGender(gender);
			ps.setString(5, a.getGender());
		}while(a.getGender()==null);
		
		
		do
		{
		
		System.out.println("Enter Age: ");
			try
			{	
				
				int age = sc.nextInt();
			 
				a.setAge(age);
				ps.setInt(6, a.getAge());
				if(age<5)
				{
					throw new ArithmeticException("age not eligible");
				}
				else
				{
				System.out.println("Age is eligible to create account");
				
				}
			}
			catch(ArithmeticException e)
			{
				System.out.println("catch block" +e.getMessage());
			}
		}while(a.getAge()==5);
		
		
		while(a.getBalance()==0)
		{
			System.out.println("Enter balance:");
			double balance = sc.nextDouble();
		
			if(balance>=1000)
			{
				System.out.println("account created successfully");
				a.setBalance(balance);
				ps.setDouble(7, a.getBalance());
			}
			else
			{
				System.out.println("cannot create account");
			}
		 }
		ps.execute();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	

	public void displayAllDetails()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 Connection con=DriverManager.getConnection(url, user, password);
			 String sql = "select * from bankaccount1";
			 PreparedStatement ps = con.prepareStatement(sql);
			 ResultSet rs = ps.executeQuery();
			 while(rs.next())
			 {
		System.out.println("Display all Details");
		System.out.println("Account no.: " +rs.getInt(1));
		System.out.println("Account Name: "+rs.getString(2));
		System.out.println("Mobile number: "+rs.getString(3) );
		System.out.println("adhar number: " +rs.getString(4));
		System.out.println("gender : " +rs.getString(5));
		System.out.println("Age: " +rs.getInt(6));
		System.out.println("Balance: " +rs.getDouble(7));
			 }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void depositMoney()
	{	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement ps = con.prepareStatement(" update bankaccount1 set balance = balance + ? where acc_no = ? ");
		while(a.getAccNo()==0)
		{
		System.out.println("Enter the account no to deposit");
		int accNo = sc.nextInt();
		
		
		if(a.getAccNo()==accNo) {
				
				//ps.execute();
				System.out.println("Enter the money to deposit");
				double dep = sc.nextDouble();
				ps.setDouble(1,dep);
				ps.setInt(2, accNo);
					if(dep>=500)
					{	
						ps.executeUpdate();
						//balance = balance + dep;
						a.setBalance(balance);
					}
					else
					{
						System.out.println("entered deposit amount is less");
					}
			}
		else
				System.out.println("account not found");
		}
		
		System.out.println("balance updated successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void withdrawal() {
	try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url, user, password);
	PreparedStatement ps = con.prepareStatement(" update bankaccount1 set balance = balance - ? where acc_no = ? ");
	System.out.println("Enter the account no to withdraw");
	int accNo= sc.nextInt();
	System.out.println("Enter the amount for withdrawal: ");
	double with = sc.nextDouble();
				ps.setInt(2, accNo);
				ps.setDouble(1, with);
				ps.executeUpdate();
		System.out.println("withdrawal successful");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	public void balanceCheck()
	{
		System.out.println("Balance check : " +a.getBalance());
	}
}