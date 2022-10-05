package methodreturntypeinheritance;

public class Test {


	public B m1()
	{
		B b = new B();
		b.x =50;
		return b;

	}
	public A m2()
	{
		B b = new B();
		b.x=100;
		return b;
	}
	public static void main(String args[])
	{
			B b2 = new B();
		System.out.println(b2.x);
		
		Test t = new Test();

			B b1 = t.m1();
			System.out.println(b1.x);
			B b = (B) t.m2();
			System.out.println(b.x);

}
}
