package com.stringsdemo;

import java.util.Locale;

public class IgnoreDemo {
	public static void main(String[] args) {
		String string1 = "Abcd";
		String string2 = "ABCD";
		System.out.println(string1.equalsIgnoreCase(string2));
		
		Locale locale = Locale.forLanguageTag("af-AF");
		
		System.out.println(string1.toLowerCase(locale).equals(string2.toLowerCase(locale)));
	
		String firstString = "Taki";
		String secondString = "TAKI";
		System.out.println (firstString.equalsIgnoreCase(secondString)); 
		Locale locale1 =  Locale.forLanguageTag("tr-TR");
		System.out.println(firstString.toLowerCase(locale1).equals(secondString.toLowerCase(locale1)));
	}
}
