package abstraction;

public class Interfaces implements Car, Person {

	public static void main(String[] args) {
		Interfaces i = new Interfaces();
		i.start();
		i.walk();
	}

	@Override
	public void start() {

		System.out.println("my car is starting");
	}

	@Override
	public void walk() {
		System.out.println("person is walking");
	}

}

interface Car {
	void start();

}

interface Person {
	void walk();
}