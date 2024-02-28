package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Land {
	
	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap<String, String>();
		map.put("Commercial Land", "Anil");
		map.put("Industrial Land", "Madhu");
		map.put("Residential Land", "Kiran");
		map.put("Agricultural Land", "Manoj");
		map.put("Urban Land", "Mubarak");
		
        Set<String> ref=	map.keySet();
	    ref.forEach(j->System.out.println(j));
	    
	    System.out.println("================");
	    
	    Collection<String> refCollection=map.values();
	    refCollection.forEach(h->System.out.println(h));
	}

}
