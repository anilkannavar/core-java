package com.xworkz.collection.Comparator;

import java.util.Comparator;

public class OceanImple implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) 
	{
		int oceanString2=o2.compareTo(o1);
		return oceanString2;
	}

}
