package exceptionhandlingpractice;

public class Demo103 {
	static int anyFuntion(int x, int y)
	{
		try {
			int a = x/y;
			return a;
		}
		catch(ArithmeticException E)
		{
			System.out.println("Division by zero");
		}
		return 0;
	}
	public static void main(String[] args) {
		int a , b , result;
		a= 10;b=5;
		try {
			
		
		
		
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		System.out.println("value of a and b= "+a+" "+b);
		}catch(Exception e)
		{
			result = anyFuntion(a, b);
			System.out.println("\n result : "+result);
		}
	}
}
