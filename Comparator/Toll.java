package com.xworkz.collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Toll {
	
	public static void main(String[] args) {
		
	
	
	List<Double> listref=new ArrayList<Double>();
	
    listref.add(23.67);
    listref.add(45.6);
    listref.add(78.0);
    listref.add(42.0);
    listref.add(8.99);
    listref.add(17.33);
    listref.add(5.55);
    listref.add(123.45);
    listref.add(0.77);
    listref.add(99.22);
    
    Collections.sort(listref);
    for (Double tollref : listref) 
    {
		System.out.println("After the ascending order :"+tollref);
	}
    System.out.println("******************");
	
	Comparator<Double> refComparator=new TollImple();
	Collections.sort(listref, refComparator);
	for (Double double1 : listref) 
	{
		System.out.println("After the ascending order :"+double1);

	}
	
	
	
	}

}
