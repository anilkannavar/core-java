package com.xworkz.collection.Comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Seeds {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
	

		
		list.add("Apple seed");
		list.add("Tomato Seed");
		list.add("Watermelon Seed");
		list.add("Orange Seed");
		list.add("Jackfruit Seed");
		list.add("Papaya Seed");
		list.add("Pineapple Seed");
		list.add("Chikkoo Seed");
		list.add("Strawbeery Seed");
		list.add("Banana Seed");
		
		
		 Collections.sort(list);
		for (String string : list) 
		{
			System.out.println(string);
		}
		System.out.println("**********************");
		
		Comparator<String> ref1=new SeedsImple();
		Collections.sort(list, ref1);
		for (String string1 : list) 
		{
			System.out.println(string1);
		}
	}

}
