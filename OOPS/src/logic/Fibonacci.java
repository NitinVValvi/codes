package logic;

public class Fibonacci {

	public static void main(String[] args) {
		
		int num1=0,num2 = 1,num3,i,count=5;
		
		//printing 0 and 1
		
		System.out.print(num1 + " " + num2);
	
	
		for(i=2;i<count;++i)
		{
			num3 = num1+num2;
			System.out.print(" "+ num3);
			
			num1= num2;
			num2 =num3;
		}
		
	
	}
}
