package com.braindata.bankmanagement.serviceImpl;
import com.braindata.bankmanagement.model.Account.Account;
import com.braindata.bankmanagement.service.RBI;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
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
		CallableStatement cs = con.prepareCall("call insertAccountdetails(?,?,?,?,?,?,?)");
		do
		{
		System.out.println("Enter the Account No: ");
			int n = sc.nextInt();
			a.setAccNo(n);
			cs.setInt(1, a.getAccNo());
		}while(a.getAccNo()==0);
		
		
		while(a.getName()==null)
		{
			System.out.println("Enter the account name: ");
			String name = sc.next();
			
			boolean match = Pattern.matches("^[A-Z]{1}[a-z]{1,5}",name);
			if(match)
			{
				a.setName(name);
				System.out.println("name is valid");
				cs.setString(2, a.getName());
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
				System.out.println("Mobile number pattern is right");
				cs.setString(3, a.getMobNo());
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
				cs.setString(4, a.getAdharNo());
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
			cs.setString(5, a.getGender());
		}while(a.getGender()==null);
		
		
		do
		{
		
		System.out.println("Enter Age: ");
			try
			{	
				
				int age = sc.nextInt();
			 
				a.setAge(age);
				if(age<5)
				{
					throw new ArithmeticException("age not eligible");
				}
				else
				{
				System.out.println("Age is eligible to create account");
				cs.setInt(6, a.getAge());
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
				cs.setDouble(7, a.getBalance());
			}
			else
			{
				System.out.println("cannot create account");
			}
		 }
		cs.execute();
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
			 CallableStatement cs = con.prepareCall("{call displayaccountdetails(?,?,?,?,?,?,?)}");
			 System.out.println("Enter account no to display: ");
			 int accNo = sc.nextInt();
			 a.setAccNo(accNo);
			 cs.setInt(1, a.getAccNo());
			 cs.registerOutParameter(2, Types.VARCHAR);
			 cs.registerOutParameter(3, Types.VARCHAR);
			 cs.registerOutParameter(4, Types.VARCHAR);
			 cs.registerOutParameter(5, Types.VARCHAR);
			 cs.registerOutParameter(6, Types.INTEGER);
			 cs.registerOutParameter(7, Types.DOUBLE);
			 cs.executeUpdate();
			 
			 System.out.println("Account details");
			// System.out.println("accn no "+cs.getInt(1));
			 System.out.println("name" +cs.getString(2));
			 System.out.println("mobno" +cs.getString(3));
			 System.out.println("adharno: "+cs.getString(4));
			 System.out.println("gender" +cs.getString(5));
			 System.out.println("age "+cs.getInt(6));
			 System.out.println("balance "+cs.getDouble(7));
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
		CallableStatement cs = con.prepareCall("{call depositmoneyintoaccount(?,?)}");
		System.out.println("Enter the account no to deposit");
		int accNo = sc.nextInt();
		a.setAccNo(accNo);
		cs.setInt(1, a.getAccNo());
		if(a.getAccNo()==accNo) {
			
				System.out.println("Enter the money to deposit");
				double dep = sc.nextDouble();
					if(dep>=500)
					{	
						balance = a.getBalance() + dep;
						a.setBalance(balance);
						cs.setDouble(2, a.getBalance());
					}
					else
					{
						System.out.println("entered deposit amount is less");
					}
			}
		else
			{
				System.out.println("account not found");
			}
		cs.execute();
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
	CallableStatement cs = con.prepareCall("{call withdrawmoneyfromaccount(?,?)}");
	System.out.println("Enter the account no to withdraw");
	int accNo= sc.nextInt();
	a.setAccNo(accNo);
	cs.setInt(1, a.getAccNo());
	if(a.getAccNo()==accNo)
	{
	System.out.println("Enter the amount for withdrawal: ");
	double with = sc.nextDouble();
		
		if(with>500)
		{
			a.getBalance();
			if(balance>=500)
			{
				balance = a.getBalance() - with;
				System.out.println("withdrawal successful");
				a.setBalance(balance);
				cs.setDouble(2, a.getBalance());
			}
		}
		else
		{
			System.out.println("withdrawal cant be completed enter higher amount");
		}
	}
	cs.execute();
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