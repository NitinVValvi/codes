package loopDemo;
import java.util.Scanner;
public class GuessNumber {

	public static void main(String[] args) {
		int number = (int)(Math.random()*101);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("guess the magic number between 0 to 100");
		sc.close();
		int guess = -1;
		while(guess!= number)
		{
			
			System.out.println("enter the guess number:");
			guess  = sc.nextInt();
			
			if (guess == number)
				System.out.println("yes the number is correct:" +number);
			else if(guess > number)
				System.out.println("your guess is too high");
			else
				System.out.println("your guess is too low");
		}
	}

}
