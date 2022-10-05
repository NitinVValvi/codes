package javaprac;

public class Reverse {
public static void main(String[] args) {
	
	/*
	 * String str = "rahul"; String emptystring =""; char ch;
	 * 
	 * for(int i=0;i<str.length();i++) { ch = str.charAt(i);
	 * 
	 * emptystring = ch+emptystring; }
	 * 
	 * System.out.println("reverse::  "+emptystring);
	 */
	
	String inputstr = "suraj";
	
	char[] rev = inputstr.toCharArray();
	for(int i = rev.length-1;i>=0;i--) {
		System.out.println(rev[i]);
	}
}
}