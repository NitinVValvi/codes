package exceptionhandlingpractice;

public class Demo101 {
	public static void main(String args[ ]) {
		System.out.println("enter the integers");
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a/b;
		System.out.println("value of c: "+c);
	}
}
