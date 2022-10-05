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
		  System.out.print("Enter Account No: ");
	      long accno = sc.nextLong();
	      a.setAccNo(accno);
	      System.out.print("Enter Name: ");
	      String name = sc.next();
	      a.setName(name);
	      System.out.print("Enter mob no: ");
	      String mob_no = sc.next();
	      a.setMobNo(mob_no);
	      System.out.print("Enter adhar no: ");
	      String adharno = sc.next();
	      a.setAdharNo(adharno);
	      System.out.print("Enter gender: ");
	      String gender = sc.next();
	      a.setGender(gender);
	      System.out.print("Enter age: ");
	      int age = sc.nextInt();
	      a.setAge(age);
	      System.out.print("Enter Balance: ");
	      double balance =sc.nextDouble();
	      a.setBalance(balance);
	      
	}	
	public void displayAllDetails()
	{
		System.out.print("accno:"+a.getAccNo()+"\nname:"+a.getName()+"\nmobno:"+a.getMobNo()+"\nadharno:"+a.getAdharNo()+"\ngender:"+a.getGender()+"\nage:"
	+a.getAge()+"\nbalance"+a.getBalance()+"\n");
	}
	public void depositMoney()
	{	
			double dep;
			System.out.print("Enter amount to deposit: ");
			dep = sc.nextDouble();
			double balance = a.getBalance()+dep;
			a.setBalance(balance);
			System.out.print("updated balance : "+a.getBalance()+"\n");
	}
	public void withdrawal() {
			double with;
			System.out.print("Enter amount to withdraw: ");
			with = sc.nextDouble();
			double balance = a.getBalance()-with;
			a.setBalance(balance);
			System.out.print("Balance after withdrawal: "+a.getBalance()+"\n");
	}
	public void balanceCheck()
	{
		System.out.println("Balance check : " +a.getBalance());
	}
}