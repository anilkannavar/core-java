package com.xworkz.object;

public class Seed {
	
	String seedname;
	
	double cost;
	
	int packetno;

	public Seed(String seedname, double cost, int packetno)
	{
		
		this.seedname = seedname;
		this.cost = cost;
		this.packetno = packetno;
	}

	@Override
	public String toString() 
	{
		return "Seed [seedname=" + seedname + ", cost=" + cost + ", packetno=" + packetno + "]";
	}
	
	@Override
	public int hashCode()
	{
		return 100;
	}
	
	

}
