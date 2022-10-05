package com.inheritance;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("term  policy");
		TermPolicy tp = new TermPolicy();
		
		tp.getTermPolicy();
		tp.getTermPolicyDetails();
		tp.getInsuranceDetail();
		tp.getLifeInsuranceInformation();
		tp.getInsuranceInformation();
		tp.getInsuranceDetail();
		System.out.println(tp.duration);
		System.out.println(tp.id);
		System.out.println(tp.personName);
		System.out.println(tp.premiumAmount);
		System.out.println("Life Insurance");
		
		LifeInsurance li = new LifeInsurance();
		li.getInsuranceDetail();
		li.getInsuranceInformation();
		li.getLifeInsuranceDetail();
		li.getLifeInsuranceInformation();
		
		System.out.println("Insurance ");
		
		Insurance i = new Insurance();
		
		i.getInsuranceDetail();
		i.getInsuranceInformation();
		
		System.out.println("Life insurance Extends Insurance");
		Insurance i1 = new LifeInsurance();
		i1.getInsuranceDetail();
		i1.getInsuranceInformation();
		System.out.println(i1.id);
		System.out.println(i1.personName);
		
		System.out.println("Term policy extends LifeInsurance");
		LifeInsurance l1 = new TermPolicy();
		l1.getInsuranceDetail();
		l1.getInsuranceInformation();
		l1.getLifeInsuranceInformation();
		l1.getLifeInsuranceDetail();
		System.out.println(l1.id);
		System.out.println(l1.personName);
		System.out.println(l1.premiumAmount);
		

		System.out.println("Insurance and Termpolicy Reference Class as Insurance");
		Insurance i2 = new TermPolicy();
		i2.getInsuranceDetail();
		i2.getInsuranceInformation();
		System.out.println(i2.id);
		System.out.println(i2.personName);
		
		
		/*
		 * System.out.println("TypeCasting IMP"); TermPolicy tp1 = (TermPolicy) new
		 * LifeInsurance();
		 * 
		 * tp1.getInsuranceDetail(); tp1.getInsuranceInformation();
		 * tp1.getLifeInsuranceDetail(); tp1.getLifeInsuranceInformation();
		 * tp1.getTermPolicy(); tp1.getTermPolicyDetails();
		 * System.out.println(tp1.duration); System.out.println(tp1.id);
		 * System.out.println(tp1.personName); System.out.println(tp1.premiumAmount);
		 * 
		 * 
		 */
	}
}
