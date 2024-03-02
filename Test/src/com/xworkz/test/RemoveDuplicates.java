package com.xworkz.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		Collection<String> collections=new ArrayList<String>();
		collections.add("a");
		collections.add("b");
		collections.add("c");
		collections.add("a");
		collections.add("z");
		
		System.out.println("original list elements is :"+collections);
		
		HashSet<String> hashSet=new HashSet<String>();
		
		System.out.println("elements after removing duplicates");
		
		hashSet.clear();
		
		
	}

}
