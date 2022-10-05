package com.braindata.bankmanagement.client;
import com.braindata.bankmanagement.model.Account.Account;
//import com.braindata.bankmanagement.model.Account.Account;
import com.braindata.bankmanagement.service.RBI;
import com.braindata.bankmanagement.serviceImpl.SBI;

import java.util.Scanner;
public class Test {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		RBI bank = new SBI();
		//Account a = new Account();
		while(true)
		{
		System.out.println("********************************");
		
		System.out.println("Enter 1 for create an account");
		
		System.out.println("Enter 2 for display account details");
		
		System.out.println("Enter 3 for depositmoney");

		System.out.println("Enter 4 for withdrawal");

		System.out.println("Enter 5 for balancechcek");

		
		int no = sc.nextInt();
		//int flag = 0;
		switch(no)
		{
			case 1:	bank.createAccount();
			break;
			
			case 2: bank.displayAllDetails();
			break;
			
			case 3:bank.depositMoney();
			break;

			case 4: bank.withdrawal();
			break;

			case 5: bank.balanceCheck();

			case 6: System.out.println("Exit");
			sc.close();
			return;
		}
		}
	}
}