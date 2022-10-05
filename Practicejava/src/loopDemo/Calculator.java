package loopDemo;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num1 = in.nextInt();
		System.out.println("enter the another number: ");
		int num2 = in.nextInt();
		System.out.println("Additon of " +num1+ " & " +num2+ " is : " +(num1+num2));
//		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num3 = in.nextInt();
		System.out.println("enter the another number: ");
		int num4 = in.nextInt();
		in.close();
		
		System.out.println("Subtraction of " +num3+ " & " +num3+ " is : " +(num3-num4));
		}
	
}
