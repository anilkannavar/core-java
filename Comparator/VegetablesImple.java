package com.xworkz.collection.Comparator;

import java.util.Comparator;

public class VegetablesImple implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) 
	{
        int ref4=o2.compareTo(o1);
		return ref4;
	}

}
