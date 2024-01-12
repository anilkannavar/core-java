package com.xworkz.collections.belt;

import java.util.Comparator;

public class BeltComparator implements Comparator<BeltDTO>{

	@Override
	public int compare(BeltDTO o1, BeltDTO o2) {
		int n=o1.getBrand().compareTo(o2.getBrand());
        return n;
	}
}

class BeltBrandComparatorDec implements Comparator<BeltDTO>{

	@Override
	public int compare(BeltDTO o1, BeltDTO o2) {
		int n=o2.getBrand().compareTo(o1.getBrand());
        return n;
	}
}

class BeltTypeComparatorAsc implements Comparator<BeltDTO>{

	@Override
	public int compare(BeltDTO o1, BeltDTO o2) {
		int n=o1.getType().compareTo(o2.getType());
        return n;
	}
}

class BeltTypeComparatorDec implements Comparator<BeltDTO>{

	@Override
	public int compare(BeltDTO o1, BeltDTO o2) {
		int n=o2.getType().compareTo(o1.getType());
        return n;
	}
}

class BeltCostComparatorAsc implements Comparator<BeltDTO>{

	@Override
	public int compare(BeltDTO o1, BeltDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
	}
}

class BeltCostComparatorDec implements Comparator<BeltDTO>{

	@Override
	public int compare(BeltDTO o1, BeltDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
	}
}

class BeltQuantityComparatorAsc implements Comparator<BeltDTO>{

	@Override
	public int compare(BeltDTO o1, BeltDTO o2) {
        return Double.compare(o1.getQuantity(), o2.getQuantity());
	}
}

class BeltQuantityComparatorDec implements Comparator<BeltDTO>{

	@Override
	public int compare(BeltDTO o1, BeltDTO o2) {
        return Double.compare(o2.getQuantity(), o1.getQuantity());
	}
}

