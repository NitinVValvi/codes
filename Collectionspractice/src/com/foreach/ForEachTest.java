package com.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ForEachTest {
	public static void main(String[] args) {

		//ArrayList<String> list = new ArrayList<>();
		
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();

//		List<String> listofNames = Arrays.asList("nitin", "rahul", "sumit", "sanket", "mangesh", "nitish");
 
		List<String> listofNames = new LinkedList<String>( Arrays.asList("nitin", "rahul", "sumit", "sanket", "mangesh", "nitish"));

		list.addAll(listofNames);

		for (String name : list) {
			System.out.println(name);

			 //list.remove(2);

		}
		System.out.println("************");

	
		//Iterator<String> itr = list.iterator();
		Iterator<String> itr = listofNames.iterator();

		while(itr.hasNext()) {
			String i = itr.next();
			
			if(i.equals("sanket")) {
				//itr.remove();
				
				list.add("Pratik");
				System.out.println();
			}
		}
	
		for(String l :list) {
			System.out.println(l);
		}
		
		
		System.out.println("**************");
		
		for(String l :listofNames) {
			System.out.println(l);
		}
		
	}

	

}
