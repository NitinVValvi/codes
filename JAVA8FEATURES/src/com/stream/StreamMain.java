package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(4);
		list1.add(12);
		list1.add(34);
		list1.add(45);
		list1.add(57);
		list1.add(89);
		
		List<Integer> listEven = new ArrayList<>();
		
		System.out.println(listEven);
		for(Integer i : list1)
		{
			if(i%2 == 0)
			{
				listEven.add(i);
			}
		}
		
		
		
	Stream<Integer> stream = list1.stream();
	List<Integer> newlist = stream.filter(i-> i%2 ==0).collect(Collectors.toList());
	}
}
