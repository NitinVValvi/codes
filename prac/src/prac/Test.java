package prac;

public class Test {
	public static void main(String[] args) {
		Dog d = new Dog();
		Animal a = (Animal)d;
		a.eat();
		
		Mammal m = new Cat();
		Animal am = new Dog();
		m.eat();m.move();m.sleep();
		am.eat();am.move();am.sleep();
		
		Cat c = new Cat();
		c.eat();
		c.move();
		c.sleep();
		c.meow();
	}
}
