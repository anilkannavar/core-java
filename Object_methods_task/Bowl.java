package com.xworkz.object;

public class Bowl {
	
	long bowlno;
	
	String brand;
	
	int cost;

	public Bowl(long bowlno, String brand, int cost) 
	{
	
		this.bowlno = bowlno;
		this.brand = brand;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Bowl [bowlno=" + bowlno + ", brand=" + brand + ", cost=" + cost + "]";
	}
	
	@Override
	public int hashCode()
	{
		return 100;
	}
	
	

}
