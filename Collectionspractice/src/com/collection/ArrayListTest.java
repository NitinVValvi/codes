package com.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArrayListTest {

	
	public static void main(String[] args) {
		
		/*
		 * List<String> nameList = new ArrayList<>(); nameList.add("Nitin");
		 * nameList.add("Rahul"); nameList.add("Mangesh");
		 */
		
		Date start = new Date();
	
		List<String> nameList = new ArrayList<>(1000000);
		
		for(int i = 0; i< 1000000; i++) {
			nameList.add("sameple name");
		}
		Date end = new Date();
		System.out.println("time taken : " +(end.getTime() - start.getTime()) + "ms");
	
	
	
	}
}
