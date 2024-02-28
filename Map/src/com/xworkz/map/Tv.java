package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Tv {
	
	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap<String, String>();
		map.put("sony experia", "sony");
		map.put("samsung ledq", "samsung");
		map.put("lg 2013", "lg");
		map.put("redmi", "mi");
		
        Set<String> ref=	map.keySet();
	    ref.forEach(j->System.out.println(j));
	    
	    System.out.println("================");
	    
	    Collection<String> refCollection=map.values();
	    refCollection.forEach(h->System.out.println(h));
	}

}
