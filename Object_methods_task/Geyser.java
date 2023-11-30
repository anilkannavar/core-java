package com.xworkz.object;

public class Geyser {
	
	String capacity;
	
	double cost;
	
	long geyserno;

	public Geyser(String capacity, double cost, long geyserno)
	{
		
		this.capacity = capacity;
		this.cost = cost;
		this.geyserno = geyserno;
	}

	@Override
	public String toString() {
		return "Geyser [capacity=" + capacity + ", cost=" + cost + ", geyserno=" + geyserno + "]";
	}
	
	@Override
	public int hashCode()
	{
		return 100;
	}

}
