package com.xworkz.collections.sparkplug;

import java.util.Comparator;

public class SparkPlugComparator implements Comparator<SparkPlugDTO>{

	@Override
	public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        int n=o1.getName().compareTo(o2.getName());
		return n;
	}
}
	
	class SparkPlugNameComparatorDec implements Comparator<SparkPlugDTO>{

		@Override
		public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
	        int n=o2.getName().compareTo(o1.getName());
			return n;
		}
	}
	
	class SparkPlugTypeComparatorAsc implements Comparator<SparkPlugDTO>{

		@Override
		public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
	        int n=o1.getType().compareTo(o2.getType());
			return n;
		}
	}
	
	class SparkPlugTypeComparatorDec implements Comparator<SparkPlugDTO>{

		@Override
		public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
	        int n=o2.getType().compareTo(o1.getType());
			return n;
		}
	}
	
	class SparkPlugCostComparatorAsc implements Comparator<SparkPlugDTO>{

		@Override
		public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
			return Double.compare(o1.getCost(), o2.getCost());
		}
	}
	
	class SparkPlugCostComparatorDec implements Comparator<SparkPlugDTO>{

		@Override
		public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
			return Double.compare(o2.getCost(), o1.getCost());
		}
	}
	
	class SparkPlugQuanityComparatorAsc implements Comparator<SparkPlugDTO>{

		@Override
		public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
			return Double.compare(o1.getQuantity(), o2.getQuantity());
		}
	}
	
	class SparkPlugQuantityComparatorDec implements Comparator<SparkPlugDTO>{

		@Override
		public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
			return Double.compare(o2.getQuantity(), o1.getQuantity());
		}
	}
	
	
	

