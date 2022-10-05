package loopDemo;

public class Multiplicationtable {

	public static void main(String[] args) {
		//table heading
		System.out.println("Multiplication table");
		
		
		System.out.print("   ");
		for(int j = 1 ; j <=9 ;j++)
			
			System.out.print("   "+j);
			
			
		System.out.println("\n---------------------------------------");
		//display table body
		for (int i=1 ;i<=9;i++) 
			{
			System.out.print(i+ "|");
				for(int j=1;j<=9;j++)
				{
					System.out.printf("%4d",i * j);
				}
				System.out.println("\n");
			}
	}	

}
