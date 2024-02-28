package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Wall {
	
	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap<String, String>();
		map.put("Precast Concrete Wall", "Blue");
		map.put("Retaining Wall", "White");
		map.put("Masonry Wall ", "Cement");
		map.put("Engineering Brick Wall ", "Orange");
		
		Set<String> mapSet=map.keySet();
		mapSet.forEach(r->System.out.println(r));
		
		System.out.println("================");
		
		Collection<String> mapSet2=map.values();
		mapSet2.forEach(g->System.out.println(g));
	}

}
