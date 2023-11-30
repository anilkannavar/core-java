package com.xworkz.object;

public class Bucket {
	
	double size;
	
	String madeof;
	
	int cost;

	public Bucket(double size, String madeof, int cost) {
	
		this.size = size;
		this.madeof = madeof;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Bucket [size=" + size + ", madeof=" + madeof + ", cost=" + cost + "]";
	}
	
	@Override
	public int hashCode()
	{
		return 100;
	}


}
