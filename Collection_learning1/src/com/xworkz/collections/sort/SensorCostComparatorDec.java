package com.xworkz.collections.sort;

import java.io.Serializable;
import java.util.Comparator;

import com.xworkz.collections.dto.SensorDTO;

public class SensorCostComparatorDec implements Comparator<SensorDTO>{

	@Override
	public int compare(SensorDTO o1, SensorDTO o2) {
		return Double.compare(o2.getCost(), o1.getCost());
	}

}
