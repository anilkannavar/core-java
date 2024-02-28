package com.xworkz.map.methods;

import java.security.PublicKey;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShoeBrandPrice {
	
	public static void main(String[] args) {
		
		Map<String, Integer> shoebrandpriceMap=new HashMap<String, Integer>();
		shoebrandpriceMap.put("Nike", 20000);
		shoebrandpriceMap.put("Jordan", 35000);
		shoebrandpriceMap.put("Reebok", 50000);
		shoebrandpriceMap.put("Gucci", 80000);
		shoebrandpriceMap.put("Adidas", 89000);
		shoebrandpriceMap.put("Bata", 21000);
		
		Map<String, Integer> shoebrandpriceMap1=new HashMap<String, Integer>();
		shoebrandpriceMap1.put("Nike", 20000);
		shoebrandpriceMap1.put("Jordan", 35000);
		shoebrandpriceMap1.put("Reebok", 50000);
		shoebrandpriceMap1.put("Gucci", 80000);
		shoebrandpriceMap1.put("Adidas", 89000);
		shoebrandpriceMap1.put("Bata", 21000);
		
		//creating object
		String str1="Nike";
		String str2="Converse";
		String str3="Gucci";
		String str4="Sparx";
		
		System.out.println("Keys are....");
		Set<String> refSet=shoebrandpriceMap.keySet();
		refSet.forEach(k->System.out.println(k));
		
		System.out.println("======================");
		
		System.out.println("Values are...");
		Collection<Integer> refCollection=shoebrandpriceMap.values();
		refCollection.forEach(k->System.out.println(k));
		
		System.out.println("=======================");

		
		System.out.println("contains key...");
		System.out.println(shoebrandpriceMap.containsKey(str1));
		System.out.println(shoebrandpriceMap.containsKey(str2));
		System.out.println(shoebrandpriceMap.containsKey(str3));
		System.out.println(shoebrandpriceMap.containsKey(str4));
		
		System.out.println("========================");
		
		System.out.println("Contains values are.......");
		System.out.println(shoebrandpriceMap.containsValue(80000));
		
		System.out.println("========================");
     
		System.out.println("Entry set are....");
	    Set<Map.Entry<String, Integer>> map1=shoebrandpriceMap.entrySet();
	    map1.forEach(g->System.out.println(g.getKey()+":"+g.getValue()));

		System.out.println("========================");

		System.out.println("Get values are....");
		System.out.println(shoebrandpriceMap.get("Nike"));
		
		System.out.println("========================");

		System.out.println("empty method values are....");
		System.out.println(shoebrandpriceMap.isEmpty());
		
		System.out.println("========================");

		System.out.println("key set are.....");
		System.out.println(shoebrandpriceMap.keySet());
		
		System.out.println("========================");

		System.out.println("put method are......");
		shoebrandpriceMap.putAll(shoebrandpriceMap1);
		shoebrandpriceMap.forEach((k,v)->System.out.println(k+":"+v));
		
		System.out.println("========================");
         
		System.out.println("remove method......");
		System.out.println(shoebrandpriceMap.remove("Nike"));
		
		System.out.println("========================");

		System.out.println("sizes are.....");
		System.out.println(shoebrandpriceMap.size());
		
	}

}
