package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Car {
	
	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap<String, String>();
		map.put("nexon", "tata");
		map.put("brezza", "suzuki");
		map.put("mustang", "ford");
		map.put("endeavor", "ford");
		
        Set<String> ref=	map.keySet();
	    ref.forEach(j->System.out.println(j));
	    
	    System.out.println("================");
	    
	    Collection<String> refCollection=map.values();
	    refCollection.forEach(h->System.out.println(h));
	}

}
