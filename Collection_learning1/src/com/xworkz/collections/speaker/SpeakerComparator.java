package com.xworkz.collections.speaker;

import java.util.Comparator;

public class SpeakerComparator implements Comparator<SpeakerDTO>{

	@Override
	public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        int n=o1.getName().compareTo(o2.getName());
		return n;
	}
}

class SpeakerNameComparatoDec implements Comparator<SpeakerDTO>{

	@Override
	public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        int n1=o2.getName().compareTo(o1.getName());
		return n1;
	}
}

class SpeakerTypeComparatoAsc implements Comparator<SpeakerDTO>{

	@Override
	public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        int n1=o1.getType().compareTo(o2.getType());
		return n1;
	}
}

class SpeakerTypeComparatoDec implements Comparator<SpeakerDTO>{

	@Override
	public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        int n1=o2.getType().compareTo(o1.getType());
		return n1;
	}
}

class SpeakerCostComparatoAsc implements Comparator<SpeakerDTO>{

	@Override
	public int compare(SpeakerDTO o1, SpeakerDTO o2) {
		return Double.compare(o1.getCost(), o2.getCost());
	}
}

class SpeakerCostComparatoDec implements Comparator<SpeakerDTO>{

	@Override
	public int compare(SpeakerDTO o1, SpeakerDTO o2) {
		return Double.compare(o2.getCost(), o1.getCost());
	}
}

class SpeakerQuantityComparatoAsc implements Comparator<SpeakerDTO>{

	@Override
	public int compare(SpeakerDTO o1, SpeakerDTO o2) {
		return Double.compare(o1.getQuantity(), o2.getQuantity());
	}
}

class SpeakerQuantityComparatoDec implements Comparator<SpeakerDTO>{

	@Override
	public int compare(SpeakerDTO o1, SpeakerDTO o2) {
		return Double.compare(o2.getQuantity(), o1.getQuantity());
	}
}


