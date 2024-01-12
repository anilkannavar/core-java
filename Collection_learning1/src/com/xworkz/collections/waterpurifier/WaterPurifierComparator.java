package com.xworkz.collections.waterpurifier;

import java.io.Serializable;
import java.util.Comparator;

public class WaterPurifierComparator implements Comparator<WaterPurifier>{

	@Override
	public int compare(WaterPurifier o1, WaterPurifier o2) {
        int n=o1.getName().compareTo(o2.getName());
		return n;
	}
}

class WaterPurifierNameComparatorDec implements Comparator<WaterPurifier>{

	@Override
	public int compare(WaterPurifier o1, WaterPurifier o2) {
        int n1=o2.getName().compareTo(o1.getName());
		return n1;
	}
}

class WaterPurifierTypeComparatorAsc implements Comparator<WaterPurifier>{

	@Override
	public int compare(WaterPurifier o1, WaterPurifier o2) {
        int n1=o1.getName().compareTo(o2.getName());
		return n1;
	}
}

class WaterPurifierTypeComparatorDec implements Comparator<WaterPurifier>{

	@Override
	public int compare(WaterPurifier o1, WaterPurifier o2) {
        int n1=o2.getName().compareTo(o1.getName());
		return n1;
	}
}

class WaterPurifierCostComparatorAsc implements Comparator<WaterPurifier>{

	@Override
	public int compare(WaterPurifier o1, WaterPurifier o2) {
      return Double.compare(o1.getCost(), o2.getCost());
	}
}

class WaterPurifierCostComparatorDec implements Comparator<WaterPurifier>{

	@Override
	public int compare(WaterPurifier o1, WaterPurifier o2) {
      return Double.compare(o2.getCost(), o1.getCost());
	}
}

class WaterPurifierQuantityComparatorAsc implements Comparator<WaterPurifier>{

	@Override
	public int compare(WaterPurifier o1, WaterPurifier o2) {
      return Double.compare(o1.getQuantity(), o2.getQuantity());
	}
}

class WaterPurifierQuantityComparatorDec implements Comparator<WaterPurifier>{

	@Override
	public int compare(WaterPurifier o1, WaterPurifier o2) {
      return Double.compare(o2.getQuantity(), o1.getQuantity());
	}
}


