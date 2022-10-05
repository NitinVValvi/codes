package demo;

public class Test {
	public static void main(String[] args) {
		//B b = new B();
		//b.m2();
		
		A a = new B();
		//a.m2();
		//a.m1();
		
		B b1 = (B)a;
		b1.m2();
	}
}
