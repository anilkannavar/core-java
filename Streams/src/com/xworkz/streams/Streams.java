package com.xworkz.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Streams {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("Tent");
		list.add("sleeping bag");
		list.add("fire");
		list.add("pocket knife");
		list.add("Cooking set");
		list.add("lighting");
		list.add("first aid kit");
		list.add("water");
		list.add("hiking pack");
		list.add("Food and drinks");
		
		System.out.println("items having items starting from t...");
		list.stream().filter(f1->f1.contains("t")).forEach(f1->System.out.println(f1));
		
		System.out.println("All the items in decending order...");
		list.stream().sorted(Collections.reverseOrder()).forEach(f1->System.out.println(f1));
		
		System.out.println("All the items which has 5 characters...");
		list.stream().filter(f1->f1.length()<5).sorted(Collections.reverseOrder()).forEach(f1->System.out.println(f1));
		
		System.out.println("Filetrs all items and contains which has a.... ");
		list.stream().filter(f1->f1.contains("a")).forEach(f1->System.out.println(f1.toUpperCase()));
		
		System.out.println("All the items which has t and count the elemenst...");
	    long ref=list.stream().filter(f1->f1.contains("t")).count();
        System.out.println(ref);
        
        System.out.println("All the items which has a and o and make it has ascending order...");
        list.stream().filter(f1->f1.contains("a") && f1.contains("o")).sorted().forEach(f1->System.out.println(f1));
    }
}
