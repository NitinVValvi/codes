package finallydemo;

public class Test1 {
	public int m1()
	{
		System.out.println("m1-- test1");
		if(true)
		{
			return 10;
		}
		//System.out.println("Hello");
		return 30;
	}
	public static void main(String[] args) {
		Test1 t = new Test1();
		int x = t.m1();
		System.out.println(x);
	}
}
