package bankmangement;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//SBI sb = new SBI();
		RBI bank = new SBI();
		//sb.createAccount();
		//Account a = new Account();
		/*
		 * System.out.println("Create account for customers");
		 * 
		 * int n = sc.nextInt();
		 */
		/*
		 * for(int i =0; i<n;i++) { System.out.println("Enter the info for customer");
		 * System.out.println(i+1); bank.createAccount();
		 * System.out.println("----------------------------");
		 * 
		 * }
		 */
		while(true)
		{
			System.out.println("********************************");
		
			System.out.println("Enter 1 for create an account");
		
			System.out.println("Enter 2 for display account details");
		
			System.out.println("Enter 3 for depositmoney");

			System.out.println("Enter 4 for withdrawal");

			System.out.println("Enter 5 for balancecheck");

			
			int no = sc.nextInt();
			boolean flag = false;
			if(no!=6)
			{
			switch(no)
				{
				
				case 1:bank.createAccount();
					if(flag == true)
				{
					bank.createAccount();
				}
				else {
				System.out.println("enter amount more than 1000");
				}
				break;
			
				case 2:bank.displayAllDetails();
					/*
					 * if(flag==false) { bank.displayAllDetails(); }
					 */
				break;
				
				case 3:
				System.out.println("Deposit section");
				bank.depositMoney();
				if(flag=false)
				{
					bank.depositMoney();
				}
				
					/*if(flag =false)
				{
					System.out.println("wrong account number: ");
				}
				else
				{
					flag = true;
				System.out.println("Enter the account no.");
				int accNo = sc.nextInt();
				
				bank.depositMoney();
				}*/
			
				break;

				case 4: System.out.println("Withdrawal section");
				bank.withdrawal();
			
				break;

				case 5: bank.balanceCheck();
				break;
				case 6: System.out.println("Exit");
				sc.close();
				return ;
			}
			}
		}
	}
}