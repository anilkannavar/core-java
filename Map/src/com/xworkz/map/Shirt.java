package com.xworkz.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Shirt {
	
	public static void main(String[] args) {
		
		Map<String, Integer> shirtMap =new HashMap<String, Integer>();
		shirtMap.put("Luis philippe", 2012);
		shirtMap.put("Van huesem", 2003);
		shirtMap.put("Bull", 2001);
		shirtMap.put("Peter england", 2023);
		shirtMap.put("Zara", 2018);
		
	    Set<String> refSet=shirtMap.keySet();
	    refSet.forEach(e->System.out.println(e));
	    
	    System.out.println("===================");
	    
	    Collection<Integer> refCollection=shirtMap.values();
	    refCollection.forEach(f->System.out.println(f));
	}

}
