package javaprac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortUsingLambdanadStrem {

	public static void main(String[] args) {
		
	
	//List<Integer> list = Arrays.asList(2, 7, 3, 8, 16, 11, 14, 35, 23, 26, 37, 50, 41, 38);
	
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(6);
		list.add(7);
		
		
	List<Integer> sortedList = list.stream()
			.sorted((i1,i2)->i2.compareTo(i1))
			.collect(Collectors.toList());
	
	System.out.println(sortedList);
	
	
	}
}
