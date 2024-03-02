package com.xworkz.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckElementPresentOrNot {

	public static void main(String[] args) {
		
		Set<String> set1=new HashSet();
		set1.add("argentina");
		set1.add("india");
		set1.add("portugal");
	    set1.add("brazil");
		set1.add("germany");
		
		System.out.println("original set elemets is :"+set1);
		
		System.out.println(set1.contains("portugal"));

	}
}
