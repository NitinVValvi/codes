package finallydemo;

public class Test2 {
	public int m1()
	{
		int x = 10;
	
		try 
		{
			System.out.println("try start");
			return x;
		}
		finally
		{
			System.out.println("try block");
		}
	}
	public static void main(String[] args) {
		Test2 t = new Test2();
		int x = t.m1();
		System.out.println(x);
	}
}
