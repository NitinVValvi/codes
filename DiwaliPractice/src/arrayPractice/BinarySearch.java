package arrayPractice;

public class BinarySearch {
	public static void main(String[] args) {
		int[]a = {2,5,7,9,11,13,15,17,19,20};
		
		int search = 13;   //index    0 1 2 3 4 5 6 7 8 9 10 11 
		int li = 0;                // 2 5 7 9 11 13 15 17 19 20 
		
		int hi = a.length-1;
		int mi = (li+hi)/2;
		while(li<=hi)
		{
			if(a[mi] == search)
			{
				System.out.println("element is at "+mi+" index position");
				break;
			}
			else if(a[mi] < search)
			{
				li = mi+1;
			}
			else
			{
				hi = mi-1;
			}
			mi = (li+hi)/2;
		}
		if(li> hi)
		{
			System.out.println("element not found");
		}
	}
}
