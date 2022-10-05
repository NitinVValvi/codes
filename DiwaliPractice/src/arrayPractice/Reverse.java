package arrayPractice;
import java.util.*;
public class Reverse 
{
	public static void reverse(int arr[])
	{
		for(int i = 0;i<arr.length/2;i++)
		{
			int temp = arr[i];
			arr[i]=arr[(arr.length-1)-i];
			arr[(arr.length-1)-i]= temp;
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numnber of element");
		int n = sc.nextInt();
		int arr[]= new int[n];
		
		System.out.println("Enter the element into array");
		for(int i = 0; i<n;i++)
		{
			arr[i]= sc.nextInt();
		}
		reverse(arr);
		sc.close();
		System.out.println("after reverse");
		for(int i = 0;i<n;i++)
		{
			System.out.printf("a[%d] = %d\n",i,arr[i]);
		}
		
	}

}
