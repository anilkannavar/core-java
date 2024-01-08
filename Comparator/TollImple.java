package com.xworkz.collection.Comparator;

import java.util.Comparator;

public class TollImple implements Comparator<Double>{

	@Override
	public int compare(Double o1, Double o2) 
	{
		int ref=o2.compareTo(o1);
		return ref;
	}
	
	

}
