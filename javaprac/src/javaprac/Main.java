package javaprac;
//
//public class A {
//	static int x = 5;
//	public static void main(String[] args) {
//		//A a = new A();
//		System.out.println(x);
//	}
//}
//
//abstract class
abstract class Animal{
	//abstract method does not have a body
	abstract void animalSound();
	//regular default method
	void sleep()
	{
		System.out.println("zz");
	}
}
//subclass inhertit from animal
class Pig extends Animal
{
	void animalSound()
	{
		//body of method animalsound is provided 
		System.out.println("the pig say wee");
	}
}
class Main{
	public static void main(String[] args) {
		Pig pig = new Pig();//create a object of Pig
		pig.animalSound();
		pig.sleep();
	}
}
