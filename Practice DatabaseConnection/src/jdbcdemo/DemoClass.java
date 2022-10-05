package jdbcdemo;
public class DemoClass {
	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception
	{
		//Pqr pqr = new Pqr();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
}

class Pqr
{
	static
	{
		System.out.println("IN Static");
	}
	
	//instance
	{
		System.out.println("in instance");
	}
}