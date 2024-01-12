package com.xworkz.collections.paper;

import java.util.Comparator;

public class PaperComparator implements Comparator<PaperDTO>{

	@Override
	public int compare(PaperDTO o1, PaperDTO o2) {
        int n=o1.getName().compareTo(o2.getName());
		return n;
		}
}

class PaperNameComparatorDec implements Comparator<PaperDTO>{

	@Override
	public int compare(PaperDTO o1, PaperDTO o2) {
        int n1=o2.getName().compareTo(o1.getName());
		return 0;
	}
	
}

class PaperTypeComparatorAsc implements Comparator<PaperDTO>{

	@Override
	public int compare(PaperDTO o1, PaperDTO o2) {
        int n=o1.getType().compareTo(o2.getType());
		return n;
	}
}
	
class PaperTypeComparatorDec implements Comparator<PaperDTO>{

		@Override
		public int compare(PaperDTO o1, PaperDTO o2) {
	        int n1=o2.getType().compareTo(o1.getType());
			return n1;
		}
		
	}	
	
class PaperCostComparatorAsc implements Comparator<PaperDTO>{

	@Override
	public int compare(PaperDTO o1, PaperDTO o2) {
    return Double.compare(o1.getCost(), o2.getCost());
	}
}

class PaperCostComparatorDec implements Comparator<PaperDTO>{

	@Override
	public int compare(PaperDTO o1, PaperDTO o2) {
    return Double.compare(o2.getCost(), o1.getCost());
	}
}	

class PaperQuantityComparatorAsc implements Comparator<PaperDTO>{

	@Override
	public int compare(PaperDTO o1, PaperDTO o2) {
    return Double.compare(o1.getCost(), o2.getCost());
	}
}	

class PaperQunaityComparatorDec implements Comparator<PaperDTO>{

	@Override
	public int compare(PaperDTO o1, PaperDTO o2) {
    return Double.compare(o2.getCost(), o1.getCost());
	}
}	

