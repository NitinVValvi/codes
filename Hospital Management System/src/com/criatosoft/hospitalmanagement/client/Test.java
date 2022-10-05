package com.criatosoft.hospitalmanagement.client;

import java.util.Scanner;

import com.criatosoft.hospitalmanagement.service.Sancheti;
import com.criatosoft.hospitalmanagement.serviceImpl.ShivajiNagar;

public class Test{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sancheti san = new ShivajiNagar();
		while(true)
		{
			System.out.println("Enter 1 for Adding Hospital  details: ");
			System.out.println("Enter 2 for viewing Hospital 1details: ");
			System.out.println("Enter 3 for Adding Department details: ");
			System.out.println("Enter 4 for viewing Department details: ");
			System.out.println("Enter 5 for Adding Doctor details: ");
			System.out.println("Enter 6 for viewing Doctor details: ");
			System.out.println("Enter 7 for Add Patient: ");
			System.out.println("Enter 8 for view Patient :");
			System.out.println("__________________________________________");
			int no = sc.nextInt();
			if(no!=9)
			switch(no)
			{
			
			case 1 : san.addHospital();
			break;
			case 2 : san.viewHospital();
			break;
			case 3 : san.addDepartment();
			break;
			case 4 : san.viewDepartment();
			break;
			case 5 : san.addDoctor();
			break;
			case 6 : san.viewDoctor();
			break;
			case 7 : san.addPatient();
			break;
			case 8 : san.viewPatient();
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
