package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Park {
	
	public static void main(String[] args) {
		
		Collection<String> refCollection=new ArrayList<String>();
		
		refCollection.add("vishveshwarayya park");
		refCollection.add("central park");
		refCollection.add("rose garden");
		refCollection.add("sunset beach");
		refCollection.add("city square");
		refCollection.add("green meadows");
		refCollection.add("oceanfront plaza");
		refCollection.add("maple woods");
		refCollection.add("urban oasis");
		refCollection.add("tranquil groves");
		refCollection.add("serenity fields");
		refCollection.add("marina bay park");
		refCollection.add("vibrant gardens");
		refCollection.add("royal promenade");
		refCollection.add("lakeside haven");
		refCollection.add("zenith park");
		refCollection.add("cascade commons");
		refCollection.add("whispering pines");
		refCollection.add("emerald haven");
		refCollection.add("crimson meadow");
		refCollection.add("moonlit sanctuary");
		refCollection.add("majestic heights");
		refCollection.add("starry meadows");
		refCollection.add("eternal orchard");
		refCollection.add("sapphire square");
		refCollection.add("regal ridge park");
		refCollection.add("blissful arboretum");
		refCollection.add("glistening glade");
		refCollection.add("solitude springs");
		refCollection.add("whispering willows");
		refCollection.add("trinity terrace");
		refCollection.add("crescent gardens");
		refCollection.add("zen garden");
		refCollection.add("violet valley park");
		refCollection.add("silver meadow");
		refCollection.add("golden grove");
		refCollection.add("tranquil terrace");
		refCollection.add("seraphic sanctuary");
		refCollection.add("whispering brook park");
		refCollection.add("sunrise gardens");
		refCollection.add("crystal cove park");
		refCollection.add("silhouette woods");
		refCollection.add("dawn's embrace park");
		refCollection.add("emerald isles");
		refCollection.add("serendipity park");
		refCollection.add("crimson creek park");
		refCollection.add("azure heights park");
		refCollection.add("silken meadow");
		refCollection.add("whispering winds park");
		refCollection.add("regency gardens");
		refCollection.add("lunar lagoon park");
		refCollection.add("quaint quay park");
		refCollection.add("velvet vista park");
		refCollection.add("astral avenue park");
		refCollection.add("sapphire sanctuary");
		refCollection.add("blissful bay park");
		refCollection.add("radiant ravine park");
		refCollection.add("zenith zephyr park");
		refCollection.add("stellar summit park");
		refCollection.add("aurora alcove park");
		refCollection.add("luminous lanes park");
		
		Iterator<String> refIterator=refCollection.iterator();
		while(refIterator.hasNext())
		{
			String refString=refIterator.next();
			if(refString.startsWith("b"))
			{
				System.out.println("park names starats with b :"+refString);
			}
			if(refString.endsWith("k"))
			{
				System.out.println("park names ends with k :"+refString);
			}
		}
		
	}

}
