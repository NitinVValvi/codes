package strings;

import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the string");
	
	String s = sc.next();
	char[] a = s.toCharArray();
	System.out.println("Enter the character you are LOOKING FOR");
	
	System.out.println(s);
	String c = sc.next();
	char d = c.charAt(0);
	
	for(int i = 0; i<=s.length();i++) {
		if(a[i]== d) {
			if(d>='a' && d<='z') {
				d = (char) (d-32);
				
			}else if(d>='A'&& d<='Z') {
				d= (char)(d+32);
			}
			a[i]= d;
			break;
		}
	}
	
	s= String.valueOf(a);
	System.out.println(s);
	}
}
