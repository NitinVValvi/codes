package javaprac;

public class Index {

	public static void main(String[] args) {

		// indexOf() method returns inedx of a particular character
		// indexOf() returns -1 when character is not present
		// int indexOf(char ch)
		
		String str = "Hello Nitin";

		System.out.println("Index of H is :: " + str.indexOf("H"));
		System.out.println("Index of l is :: " + str.indexOf("l"));
		System.out.println("Index of o is :: " + str.indexOf("o"));
		System.out.println("Index of N is :: " + str.indexOf("N"));

	}
}
