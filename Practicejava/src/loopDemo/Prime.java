package loopDemo;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		
	//	Scanner sc = new Scanner(System.in);
	
		int num = 5 ;
	//	System.out.println("Enter the number");
		//num = sc.nextInt();
		boolean flag = false;
		for(int i = 2; i< num;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}if(flag==true)
		{
			System.out.println("not a prime");
		}
		else {
			System.out.println("num is prime");
		}
		}
	
	}
	
