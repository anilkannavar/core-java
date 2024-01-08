package com.xworkz.collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Vegetables {
	
	public static void main(String[] args) {
		
		List<String> refofList=new ArrayList<String>();
		
		refofList.add("Tomato");
		refofList.add("Cucumber");
		refofList.add("Lettuce");
		refofList.add("Carrot");
		refofList.add("Broccoli");
		refofList.add("Bell Pepper");
		refofList.add("Spinach");
		refofList.add("Onion");
		refofList.add("Zucchini");
		refofList.add("Eggplant");


        Collections.sort(refofList);
        for (String refofliString : refofList) 
        {
			System.out.println("After arranging elements as a ascending order :"+refofliString);
		}
        System.out.println("***************");
        
        Comparator<String> refComparator=new VegetablesImple();
        Collections.sort(refofList, refComparator);
        for (String vegetableString : refofList) 
        {
			System.out.println("After arranging elements as a descending order :"+vegetableString);
		}


	}

}
