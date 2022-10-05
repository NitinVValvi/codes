package bankmangement;
import java.util.Scanner;
import java.util.regex.Pattern;
public class SBI implements RBI
{
	Scanner sc = new Scanner(System.in);
	Account a = new Account();
	double balance;
	public void createAccount()
	{
		do
		{
		System.out.println("Enter the Account No: ");
		try
		{	
			String n = sc.next();
			int accNo = Integer.parseInt(n); 
			a.setAccNo(accNo);
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("catch block" +e.getMessage());
		}
		}while(a.getAccNo()==0);
		
		
		while(a.getName()==null)
		{
			System.out.println("Enter the account name: ");
			String name = sc.next();
		
			boolean match = Pattern.matches("^[A-Z]{1}[a-z]{1,5}",name);
			if(match)
			{
				a.setName(name);
				System.out.println("name is valid");
			}	
			else
			{
				System.out.println("Enter the valid name");
			}
		}
		
		
		
		while(a.getMobNo()==null)
		{
			System.out.println("Enter mobile number: ");
			String mob = sc.next();
			boolean match = Pattern.matches("^[7-9]{1}[0-9]{9}", mob);
			if(match)
			{
				a.setMobNo(mob);
				System.out.println("Mobile number pattern is right");
			}
			else
			{
				System.out.println("Mobile number pattern is wrong");
				
			}
		}
		
		do 
		{
		System.out.println("Adhar number: ");
		String adhar = sc.next();
		boolean match = Pattern.matches("[0-9]{4}[0-9]{4}[0-9]{4}", adhar);
			if(match)
			{
				a.setAdharNo(adhar);
				System.out.println("Adhar pattern is valid");
			}
			else 
			{
				System.out.println("Enter the correct pattern");
			}
		}
		while(a.getAdharNo()==null);
		
		do
		{
			System.out.println("Enter Gender: ");
			String gender = sc.next();
			boolean match = Pattern.matches("[M]{1}[a-z]{3}||^[F]{1}[a-z]{5}||[a-z]{5}", gender);
 			if(match)
			{
				a.setGender(gender);
				System.out.println("its male");
			}
 			else if(match==false)
			{
				a.setGender(gender);
				System.out.println("its female");
			}
			else
			{
				a.setGender(gender);
				System.out.println("its other");
			}
		}while(a.getGender()==null);
		
		
		do
		{
		
		System.out.println("Enter Age: ");
			try
			{	
				
				int age = sc.nextInt();
				if(age<5)
				{
					throw new ArithmeticException("age not eligible");
				}
				
			}
			catch(ArithmeticException e)
			{
				System.out.println("catch block" +e.getMessage());
			}
		}while(a.getAge()==5);
		
		
		while(a.getBalance()==0)
		{
			System.out.println("Enter balance:");
			double balance = sc.nextDouble();
		
			if(balance>=1000)
			{
				System.out.println("account created successfully");
				a.setBalance(balance);
			
			}
			else
			{
				System.out.println("cannot create account");
			}
		 }
		
		
	}	
		
	public void displayAllDetails()
	{
	
		
		while(a.getAccNo()==0)
		{
			System.out.println("Enter account no to display");
			int accNo= sc.nextInt();
			if(a.getAccNo()==accNo)
			{	
				System.out.println("Display all Details");
				System.out.println("Account no.: " +a.getAccNo());
				System.out.println("Account Name: " +a.getName());
				System.out.println("Mobile number: " +a.getMobNo());
				System.out.println("adhar number: " +a.getAdharNo());
				System.out.println("gender : " +a.getGender());
				System.out.println("Age: " +a.getAge());
				System.out.println("Balance: " +a.getBalance());
			}
			else
			{
				System.out.println("Account not found");
				
			}
		}
	}
	public void depositMoney()
	{	
		System.out.println("Enter the account no to deposit");
		int accNo= sc.nextInt();
		if(a.getAccNo()==accNo)
		{
			System.out.println("Enter the money to deposit");
			double dep = sc.nextDouble();
				if(dep>=500)
				{	
					balance = a.getBalance() + dep;
					a.setBalance(balance);
					System.out.println("Balance after the deposit is: " +a.getBalance());
				}
				else
				{
					System.out.println("entered deposit amount is less");
				}
		}else
		{
			System.out.println("Enter the right account no");
		}
	}
	public void withdrawal()
	{	
		//enter the amount to withdraw
		System.out.println("Enter limit for withdrawal");
		int no = sc.nextInt();
		for(int i =1;i<=no;i++)
		{
			System.out.println("Enter the amount for withdrawal: ");
			double with = sc.nextDouble();
			
			if(with<500)
			{
			
				System.out.println("withdrawal cant be completed enter higher amount");
			
			}
			else
			{
				a.setBalance(balance);
				if(balance>=500)
				{
					balance = balance - with;
					System.out.println("withdrawal successful");
					a.setBalance(balance);
					System.out.println("Balance after withdrawal" +a.getBalance());
				}else
					System.out.println("can't withdraw");
			}
			
		}
	}
	public void balanceCheck()
	{
		System.out.println("Balance check : " +a.getBalance());
	}
}