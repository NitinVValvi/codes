package logic;

import java.util.Arrays;

public class ArraySortEx {

	public static void main(String[] args) {
		
		int[] array = new int[] {12,1,23,3,6,15,25,76};
	
		Arrays.parallelSort(array);
		System.out.println("sorted array");
	
		for(int i = 0; i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
}
