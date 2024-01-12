package com.xworkz.collections.sort;

import java.util.Comparator;

import com.xworkz.collections.dto.SensorDTO;

public class SensorDistanceComparatorDec implements Comparator<SensorDTO> {

	@Override
	public int compare(SensorDTO o1, SensorDTO o2) {
		return Double.compare(o2.getDistance(), o1.getDistance());
	}

}
