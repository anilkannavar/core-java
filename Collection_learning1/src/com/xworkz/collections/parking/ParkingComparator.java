package com.xworkz.collections.parking;

import java.util.Comparator;

public class ParkingComparator implements Comparator<ParkingDTO>{

	@Override
	public int compare(ParkingDTO o1, ParkingDTO o2) {
        int n=o1.getBrand().compareTo(o2.getBrand());
		return n;
	}
}

class ParkingBrandComparatorDec implements Comparator<ParkingDTO>{

	@Override
	public int compare(ParkingDTO o1, ParkingDTO o2) {
        int n=o2.getBrand().compareTo(o1.getBrand());
		return n;
	}
}

class ParkingCostComparatorAsc implements Comparator<ParkingDTO>{

	@Override
	public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
	}
}

class ParkingCostComparatorDec implements Comparator<ParkingDTO>{

	@Override
	public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
	}
}

class ParkingQuantityComparatorAsc implements Comparator<ParkingDTO>{

	@Override
	public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Double.compare(o1.getQuantity(), o2.getQuantity());
	}
}

class ParkingQuantityComparatorDec implements Comparator<ParkingDTO>{

	@Override
	public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Double.compare(o1.getQuantity(), o2.getQuantity());
	}
}

class ParkingCountryComparatorAsc implements Comparator<ParkingDTO>{

	@Override
	public int compare(ParkingDTO o1, ParkingDTO o2) {
        int n=o1.getCountry().compareTo(o2.getCountry());
		return n;
	}
}

class ParkingCountryComparatorDec implements Comparator<ParkingDTO>{

	@Override
	public int compare(ParkingDTO o1, ParkingDTO o2) {
        int n=o2.getCountry().compareTo(o1.getCountry());
		return n;
	}
}
