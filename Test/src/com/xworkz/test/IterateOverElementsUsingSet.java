package com.xworkz.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateOverElementsUsingSet {
	
	public static void main(String[] args) {
		
		Set<String> set=new HashSet<String>();
		set.add("davangere");
		set.add("banglore");
		set.add("chitradurga");
		set.add("shivamogga");
		set.add("harihara");
		
		
		System.out.println("iterating over elements");
		for (String cities : set) {
			System.out.println(cities);
		}
	}

}
