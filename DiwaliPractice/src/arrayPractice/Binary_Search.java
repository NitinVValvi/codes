package arrayPractice;
/*java code to search an element from the a array using binary search technique
 * -> Search a sorted array by dividing the searh interval in half. if the value 
 * of the search key is less than the item in the middle of the interval, narrow
 * the interval to another half otherwise narrow it to the upper half*/
import java.util.Scanner;
public class Binary_Search {
	public static void main(String[] args) {
		int arr[]= {2,4,5,7,6,9,12,15,18};
		int first, mid, last;
		System.out.println("Given array element");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("\n***************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to search: ");
		int search = sc.nextInt();
		first = 0;
		last = arr.length-1;
		mid = (first+last)/2;
		while(first<=  last)
		{
			if(arr[mid]< search)
			{
				first = mid+1;
			}
			else if(arr[mid]== search)
			{
				System.out.println("\n" +search+" is found at the location: "+(mid+1));
				break;
			}
			else
			{
				last = mid-1;
			}
			mid = (first+last)/2;
		}
		if(first > last)
		{
			System.out.println("Element not found!adios");
		}sc.close();
	}
}
