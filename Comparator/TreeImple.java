package com.xworkz.collection.Comparator;

import java.util.Comparator;

public class TreeImple implements Comparator<Integer> 
{

	@Override
	public int compare(Integer o1, Integer o2) 
	{
		int reftree=o2.compareTo(o1);
		return reftree;
	}

}
