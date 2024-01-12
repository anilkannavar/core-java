package com.xworkz.collections.charcoal;

import java.util.Comparator;

public class CharcoalComparator implements Comparator<CharcoalDTO>{

	@Override
	public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        int n=o1.getName().compareTo(o2.getName());
        return n;
	}

}

class CharcoalNameComparatorDec implements Comparator<CharcoalDTO>{

	@Override
	public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        int n=o2.getName().compareTo(o1.getName());
        return n;
	}
}

class CharcoalLocationComparatorAsc implements Comparator<CharcoalDTO>{

	@Override
	public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        int n=o1.getLocation().compareTo(o2.getLocation());
        return n;
	}

}

class CharcoalLocationComparatorDec implements Comparator<CharcoalDTO>{

	@Override
	public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        int n=o2.getLocation().compareTo(o1.getLocation());
        return n;
	}
}

class CharcoalCostComparatorAsc implements Comparator<CharcoalDTO>{

	@Override
	public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
	}

}

class CharcoalCostComparatorDec implements Comparator<CharcoalDTO>{

	@Override
	public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
	}

}

class CharcoalQuantityComparatorAsc implements Comparator<CharcoalDTO>{

	@Override
	public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Double.compare(o1.getQuantity(), o2.getQuantity());
	}

}

class CharcoalQuantityComparatorDec implements Comparator<CharcoalDTO>{

	@Override
	public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Double.compare(o2.getQuantity(), o1.getQuantity());
	}

}