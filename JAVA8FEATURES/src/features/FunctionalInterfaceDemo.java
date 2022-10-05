package features;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

	void singleAbstractMethod();
	
	default void printName() {
		System.out.println("hello");
	}
	
	default void printName2() {
		System.out.println("name 2");
	}
	
}
