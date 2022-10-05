package com.client;

import java.util.Scanner;

import com.serviceImpl.StudentServiceImpl;

public class Test {
	public static void main(String[] args) {
		StudentServiceImpl stu = new StudentServiceImpl();
		Scanner sc = new Scanner(System.in);
		while(true)
			{
				System.out.println("Enter the choice:\n"+"1.create\n"+"2.insert\n"+"3.update\n"+"4.delete\n"+"5.select\n"+"6.Exit");
				int no = sc.nextInt();
				switch(no)
				{
				case 1: stu.create();
				break;
				case 2: stu.insert();
				break;
				case 3: stu.update();
				break;
				case 4: stu.delete();
				break;
				case 5: stu.select();
				break;
				case 6: System.out.println("Exit");
				return;
			}
		}
	}
}
