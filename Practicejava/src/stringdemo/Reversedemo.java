package stringdemo;

public class Reversedemo {
	public static void main(String[] args) {
		
		
		String demo ="nitin";
		String rev ="";
		
		for(int i = demo.length()-1;i>= 0;i--)
		{
			rev = rev +demo.charAt(i);
			
		}
		System.out.println("reverse string is:" +rev);
		
		
	}
}
