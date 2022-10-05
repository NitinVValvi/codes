package finallydemo;

public class Test {
	public static void main(String[] args) {
		System.out.println("try start");
		try
		{
			System.out.println("try start");
			int a= 10/2;
			System.out.println(a);
			System.out.println("try end");
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch block");
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("main end");
	}
}
