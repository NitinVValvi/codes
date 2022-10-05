package arrayPractice;

public class Even_Odd {
	public static void main(String[] args) {
		int arr[] = {12,13,15,17,20,22,23,25,26,28,29,32,35};
		System.out.println("Given array elements: ");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("**********************************");
		System.out.println("Even numbers:");
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+" ");
			}
			
		}
		System.out.println("*************************");
		System.out.println("Odd numbers are:");
		for(int i = 0;i< arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]+" ");
			}
		}
	}
}
