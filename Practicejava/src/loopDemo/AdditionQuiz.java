package loopDemo;
import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int number1 = sc.nextInt();
		System.out.println("Enter the 2nd number:");
		int number2 = sc.nextInt();
		System.out.println("what is " +number1+ "+" +number2+ "? :" );
		int answer = sc.nextInt();
		sc.close();
		while (number1 + number2 != answer)
		{
			System.out.println("wrong answer try again. what is " +number1+  " + " +number2+" ?: ");
			answer = sc.nextInt();
		}
		System.out.println("correct answer");
		
		
	}

}
