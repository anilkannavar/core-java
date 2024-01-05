package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Statue {
	public static void main(String[] args) {
		
		Collection<String> refCollection=new ArrayList<String>();
		
		refCollection.add("Snagolli Rayanna");
		refCollection.add("Valor");
		refCollection.add("Lumier");
		refCollection.add("Arbiter");
		refCollection.add("Conqueror");
		refCollection.add("Belar");
		refCollection.add("Kithur rani chennamma");
		refCollection.add("shivaji maharaj");
		refCollection.add("Illuminated Icon");
		refCollection.add("subhash chndra bose");
		refCollection.add("Grandeur Guardian");
		refCollection.add("sardar vallabhai patel");
		refCollection.add("Victory Valor");
		refCollection.add("StardustR");
		refCollection.add("atal bihari vajpayee");
		refCollection.add("Infinite Inception");
		refCollection.add("saalu marada thimmakka");
		refCollection.add("bhagath singh");
		refCollection.add("Tranquilo Medical Center");
		refCollection.add("obavva");
		refCollection.add("madakari nayaka");
		refCollection.add("Empiror");
		refCollection.add("Vanguardr");
		refCollection.add("Mythical Majesty");
		refCollection.add("savithri bayi pule");
		refCollection.add("ElegancR");
		refCollection.add("abdul kalam");
		refCollection.add("Grandeur");
		refCollection.add("Resplendent Relic");
		refCollection.add("visveswarayya");
		refCollection.add("VictoR");
		refCollection.add("EmpoweR");
		refCollection.add("Timeless Tranquility");
		refCollection.add("Pantheon Prism");
		refCollection.add("GlimmeRing Keeper");
		refCollection.add("StardustR");
		refCollection.add("SilevR ");
		refCollection.add("Zenith Zephyr");
		refCollection.add("Seraphic Solace");
		
		Iterator<String> refIterator=refCollection.iterator();
		while(refIterator.hasNext())
		{
			String refString=refIterator.next();
			if(refString.endsWith("r"))
			{
				System.out.println("ends with small r :"+refString);
			}
			if(refString.endsWith("R"))
			{
				System.out.println("ends with capital R :"+refString);
			}
					
		}

	}

}
