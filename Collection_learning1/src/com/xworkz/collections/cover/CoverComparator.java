package com.xworkz.collections.cover;

import java.util.Comparator;

public class CoverComparator implements Comparator<CoverDTO>{

	@Override
	public int compare(CoverDTO o1, CoverDTO o2) {
		int n=o1.getBrand().compareTo(o2.getBrand());
        return n;
	}
}

class CoverBrandComparatorDec implements Comparator<CoverDTO>{

	@Override
	public int compare(CoverDTO o1, CoverDTO o2) {
		int n=o2.getBrand().compareTo(o1.getBrand());
        return n;
	}
}

class CoverCostComparatorAsc implements Comparator<CoverDTO>{

	@Override
	public int compare(CoverDTO o1, CoverDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());

	}
}

class CoverCostComparatorDec implements Comparator<CoverDTO>{

	@Override
	public int compare(CoverDTO o1, CoverDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
	}
}

class CoverQuantityComparatorAsc implements Comparator<CoverDTO>{

	@Override
	public int compare(CoverDTO o1, CoverDTO o2) {
        return Double.compare(o1.getQuantity(), o2.getQuantity());
	}
}

class CoverQuantityComparatorDec implements Comparator<CoverDTO>{

	@Override
	public int compare(CoverDTO o1, CoverDTO o2) {
        return Double.compare(o2.getQuantity(), o1.getQuantity());
	}
}

class CoverCountryComparatorAsc implements Comparator<CoverDTO>{

	@Override
	public int compare(CoverDTO o1, CoverDTO o2) {
		int n=o1.getCountry().compareTo(o2.getCountry());
        return n;
	}
}

class CoverCountryComparatorDec implements Comparator<CoverDTO>{

	@Override
	public int compare(CoverDTO o1, CoverDTO o2) {
		int n=o2.getCountry().compareTo(o1.getCountry());
        return n;
	}
}
