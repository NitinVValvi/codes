package com.employeeJDBC;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		dao.connect();
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("*DETAILS*");
			System.out.println("ENTER CHOICE:\n"+"1.Add\n"+"2.Select\n"+"3.Update\n"+"4.Delete\n"+"5.Exit");
			int no = sc.nextInt();
			switch(no)
			{
			case 1 : dao.addEmployee();
			break;
			case 2 : dao.selectEmployee();
			break;
			case 3 : dao.updateEmployee();
			break;
			case 4 : dao.deleteEmployee();
			break ;
			case 5 : System.out.println("Exit");
			return;
			}
		}
	}
}
