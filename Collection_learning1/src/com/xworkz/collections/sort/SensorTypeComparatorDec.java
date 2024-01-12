package com.xworkz.collections.sort;

import java.util.Comparator;

import com.xworkz.collections.dto.SensorDTO;

public class SensorTypeComparatorDec implements Comparator<SensorDTO> {

	@Override
	public int compare(SensorDTO o1, SensorDTO o2) {
        int n1=o2.getType().compareTo(o1.getType());
		return n1;
	}

}
