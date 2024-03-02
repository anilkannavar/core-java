package com.xworkz.test;

import java.util.HashSet;
import java.util.Set;

public class RemovingElements {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<String>();
		set.add("dog");
		set.add("cat");
		set.add("buffalo");
		set.add("donkey");
		set.add("lion");
		
		System.out.println("original set elements :"+set);
		
		set.remove("buffalo");
		
		System.out.println("after removing an element :"+set);
	}
}
