package exceptionhandlingpractice;

class Dividebyzero {
	static int anyFuncion(int x, int y)
	{
		int a = x/y;
		return a;
	}
	public static void main(String[] args) {
		int result = anyFuncion(25, 0);//exception occurs here
		System.out.println("result : " +result);
	}
}
