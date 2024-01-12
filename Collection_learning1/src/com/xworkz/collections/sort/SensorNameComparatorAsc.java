package com.xworkz.collections.sort;

import java.util.Comparator;

import com.xworkz.collections.dto.SensorDTO;

public class SensorNameComparatorAsc implements Comparator<SensorDTO>{

	@Override
	public int compare(SensorDTO o1, SensorDTO o2) {
		int n= o1.getName().compareTo(o2.getName());
		return n;
	}

	
	
	

}
