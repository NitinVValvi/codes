package com.oopsbasics;

import encapsulation.EncapsulationIntro;

public class MainClass {
	public static void main(String[] args) {

		/*
		 * Person p1 = new Person();
		 * 
		 * p1.age= 30; p1.name="Nitin"; p1.eat(); p1.walk();
		 */

		/*
		 * Person p2 = new Person(32,"JAYU");
		 * 
		 * p2.eat(); p2.walk(); System.out.println("Count "+ Person.count);
		 * 
		 * 
		 * 
		 * Developer d1 = new Developer(34,"Rahul"); d1.walk(); d1.eat();
		 */
		EncapsulationIntro obj = new EncapsulationIntro();
		obj.doWork();
	}
}

class Developer extends Person {
	public Developer(int age, String name) {
		super(age, name);
	}

	void walk() {
		System.out.println("developer " + name + " walks");
	}
}

class Person {

	int age;
	String name;

	static int count;

	public Person() {
		count++;
		System.out.println("creating an object");
	}

	// to overload a constructor new constructor with fields
	public Person(int age, String name) {
		// this(); //this keyword one constructor to another contructor calling using
		// this keyword
		this.name = name;
		this.age = age;
	}

	void walk() {
		System.out.println(name + "walks");
	}

	void eat() {
		System.out.println(name + " eats");
	}

}
