package prac;
class Sample{
	void example() {
		System.out.println("sample ");
	}
}
public class Model extends Sample {
	void example() {
		System.out.println("model case");
	}
	public static void main(String[] args) {
		Model d = new Model();
		Sample a = new Sample();
		a.example();
		d.example();
		
	}
}
