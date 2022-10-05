package com.braindatawire.collegemanagement.client;

import java.sql.SQLException;
import java.util.Scanner;

import com.braibdatawire.collegemanagement.service.Cjc;
import com.braindatawire.collegemanagement.serviceImpl.Karvenagar;

public class Test {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		Cjc cjc = new Karvenagar();
		while(true)
		{
			System.out.println("Enter 1 for Adding course details: ");
			System.out.println("Enter 2 for viewing cousre 1details: ");
			System.out.println("Enter 3 for Adding faculty details: ");
			System.out.println("Enter 4 for viewing faculty details: ");
			System.out.println("Enter 5 for Adding Batch details: ");
			System.out.println("Enter 6 for viewing batch details: ");
			System.out.println("Enter 7 for add student: ");
			System.out.println("Enter 8 for view student :");
			int no = sc.nextInt();
			if(no!=9)
			switch(no)
				{
					case 1 : cjc.addCourse();
					break;
					case 2 : cjc.viewCourse();
					break;
					case 3 : cjc.addFaculty();
					break;
					case 4 : cjc.viewFaculty();
					break;
					case 5 : cjc.addBatch();
					break;
					case 6 : cjc.viewBatch();
					break;
					case 7 : cjc.addStudent();
					break;
					case 8 : cjc.viewStudent();
					break;
				}
				else
				{
					System.out.println("Exit");
					sc.close();
					return;
				}
		}
	}
}
