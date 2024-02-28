package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Food {
	
	public static void main(String[] args) {
		
		String[] ingredients= {"Chilli","Spices","Cinnamon","Calcium","Nutrition"};
		
		Map<String, String[]> map=new HashMap<String, String[]>();
		map.put("Chicken wings", ingredients);
		map.put("pizza", ingredients);
		map.put("gobi", ingredients);
		map.put("jamun", ingredients);
		map.put("sweet", ingredients);
		
	Set<String> refSet=map.keySet();
	refSet.forEach(z->System.out.println(z));
	
	System.out.println("================");
	
	Collection<String[]> refCollection=map.values();
	for (String[] strings : refCollection) {
		for (String strings2 : strings) {
			System.out.println(strings2);
		}
		
	}
	}

}
