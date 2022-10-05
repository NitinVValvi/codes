package arrayPractice;
//BubbleSort
public class BubbleSort 
{
	void bubbleSort(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i<n-1;i++)
			for(int j = 0;j<n-i-1;j++)
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1]=temp;
				}
	}
	void display(int arr[])
	{
		int n = arr.length;
		for(int i= 0;i<n;++i)
		{
			System.out.print(arr[i]+" ");
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		BubbleSort obj = new BubbleSort();
		int arr[] = {32,34,15,72,12,84,90,45,61};
		System.out.println("Length of array: "+arr.length);
		
		System.out.print("\ngiven array\n");
		obj.display(arr);
		obj.bubbleSort(arr);
		
		System.out.print("Sorted array\n");
		obj.display(arr);
	}
}
