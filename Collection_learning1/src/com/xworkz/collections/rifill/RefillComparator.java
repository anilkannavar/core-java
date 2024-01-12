package com.xworkz.collections.rifill;

import java.util.Comparator;

public class RefillComparator implements Comparator<RefillDTO>{

	@Override
	public int compare(RefillDTO o1, RefillDTO o2) {
        int n=o1.getName().compareTo(o2.getName());
		return n;
	}
}

class RefillNameComparatorDec implements Comparator<RefillDTO>{

	@Override
	public int compare(RefillDTO o1, RefillDTO o2) {
        int n=o2.getName().compareTo(o1.getName());
		return n;
	}
}

class RefillTypeComparatorAsc implements Comparator<RefillDTO>{

	@Override
	public int compare(RefillDTO o1, RefillDTO o2) {
        int n=o1.getType().compareTo(o2.getType());
		return n;
	}
}

class RefillTypeComparatorDec implements Comparator<RefillDTO>{

	@Override
	public int compare(RefillDTO o1, RefillDTO o2) {
        int n=o2.getType().compareTo(o1.getType());
		return 0;
	}
}

class RefillCostComparatorAsc implements Comparator<RefillDTO>{

	@Override
	public int compare(RefillDTO o1, RefillDTO o2) {
		return Double.compare(o1.getCost(), o2.getCost());
	}
}

class RefillCostComparatorDec implements Comparator<RefillDTO>{

	@Override
	public int compare(RefillDTO o1, RefillDTO o2) {
		return Double.compare(o2.getCost(), o1.getCost());
	}
}

class RefillQuantityComparatorAsc implements Comparator<RefillDTO>{

	@Override
	public int compare(RefillDTO o1, RefillDTO o2) {
		return Double.compare(o1.getQuantity(), o2.getQuantity());
	}
}

class RefillQuantityComparatorDec implements Comparator<RefillDTO>{

	@Override
	public int compare(RefillDTO o1, RefillDTO o2) {
		return Double.compare(o2.getQuantity(), o1.getQuantity());
	}
}