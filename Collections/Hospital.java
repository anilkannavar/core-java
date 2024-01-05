package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Hospital {
	
	public static void main(String[] args) {
		
		Collection<String> collection=new ArrayList<>();
		
		collection.add("SS Hospital");
		collection.add("Apollo");
		collection.add("Stanley polo");
		collection.add("Mercy General Hospital");
		collection.add("Hope Valley Medical");
		collection.add("Evergreen Medical Center");
		collection.add("Unity Healthcare Center");
		collection.add("Beacon Health Center");
		collection.add("Horizon Wellness Clinic");
		collection.add("Phoenix Community Hospital");
		collection.add("Radioso");
		collection.add("Tranquilo");
		collection.add("Harmony Regional Medical Center");
		collection.add("Harmonio General Hospital 	");
		collection.add("Vitality Medical Center");
		collection.add("Prestigo Medical Center");
		collection.add("Alpino Healthcare");
		collection.add("Horizono");
		collection.add("Tranquilo Medical Center");
		collection.add("Sereno");
		
		Iterator<String> refIterator=collection.iterator();
		while(refIterator.hasNext())
		{
			String refString=refIterator.next();
			if(refString.endsWith("o"))
			{
				System.out.println("hospital list :"+refString);
			}
		}
		
	}

}
