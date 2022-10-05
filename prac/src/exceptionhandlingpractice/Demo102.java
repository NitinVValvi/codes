package exceptionhandlingpractice;

public class Demo102 {
	static int anyFunction(int x ,int y)
	{
		int a = x/y;
		return a;
	}
	public static void main(String args[]) {
		int a, b , result;
		a = 10 ;
		b = 0 ;
		System.out.println("enter any two integers: ");
		
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		
		result = anyFunction(a, b);
		System.out.println("result : " +result);
	}
}
