package com.xworkz.object;

public class Bandli {
	
	double size;
	
	int cost;
	
	boolean bandliused;

	public Bandli(double size, int cost, boolean bandliused) {
	
		this.size = size;
		this.cost = cost;
		this.bandliused = bandliused;
	}

	@Override
	public String toString() {
		return "Bandli [size=" + size + ", cost=" + cost + ", bandli=" + bandliused + "]";
	}
	
	@Override
	public int hashCode()
	{
		return 100;
	}

}
