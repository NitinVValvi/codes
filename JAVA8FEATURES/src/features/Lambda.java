package features;

import java.util.function.BiConsumer;

public class Lambda {

	public static void main(String[] args) {
		/*
		 * Lambda l = new Lambda();
		 * 
		 * l.add(5, 10);
		 */
			
		
		
		BiConsumer<Integer, Integer> biConsumer =(a,b)->System.out.println(a+b);
		biConsumer.accept(4, 10);
	}
	/*
	 * public void add(int a , int b) { System.out.println(a+b); }
	 */
}
