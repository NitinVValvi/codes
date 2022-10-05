package com.company;

public class CWN_PS3_op_pre {

	public static void main(String[] args) {
		//
		int a = 6*5-34/2;
		
	/* 
	 * highest precedence goes to * and then /. They are then evaluated 
	 * on the basis of left to roght associativity
	 * =30-34/2
	 * =30-17
	 * =13
	 */
		System.out.println(a);
		
		int b = 60/5-34*2;
		
	/* 
	 * =12-34*2
	 * =12-68
	 * = -56
	 */
		System.out.println(b);
//Precedence & Associativity
		
	}

}
