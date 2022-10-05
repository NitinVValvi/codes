package arrayPractice;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = {2,5,8,7,13,17};
		int num = 13 ;
		//ans = 3;
		int flag = 0 ;
		for(int i = 0 ; i< arr.length- 1;i++)
		{
			if(arr[i]== num)
			{
				flag= i;
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println(num+ " is not present");
		}
		else
			System.out.println("number is present at the index " + flag);
	}
}
