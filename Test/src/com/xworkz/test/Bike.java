package com.xworkz.test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Bike {
	
	public static void main(String[] args) {
		
		Map<String, Integer> bikMap=new HashMap<String, Integer>();
		bikMap.put("Honda", 2012);
		bikMap.put("suzuki", 2002);
		bikMap.put("maruthi", 2015);
		bikMap.put("bajaj", 2014);
		
		Set<String> set=bikMap.keySet();
		set.forEach(p1->System.out.println(p1));
		
		Collection<Integer> collections=bikMap.values();
		collections.forEach(i->System.out.println(i));
	}

}
