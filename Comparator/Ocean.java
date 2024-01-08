package com.xworkz.collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ocean {
	
	public static void main(String[] args) {
		
		List<String> refList=new ArrayList<String>();
		
		refList.add("Gokarna Beach");
		refList.add("Kuta Beach");
		refList.add("Whitehaven Beach");
		refList.add("Anse Lazio");
		refList.add("Navagio Beach");
		refList.add("Bora Bora");
		refList.add("El Nido");
		refList.add("Seven Mile Beach");
		refList.add("Myrtos Beach");
		refList.add("Baia do Sancho");

        Collections.sort(refList);
        for (String oceanString : refList) 
        {
			System.out.println("After arranging statements as a ascending order:"+oceanString);
		}
        System.out.println("****************");


        Comparator<String> ref1=new OceanImple();
        Collections.sort(refList, ref1);
        for (String ocean1 : refList) 
        {
			System.out.println("After arranging statements as a descending order:"+ocean1);

		}

	}

}
