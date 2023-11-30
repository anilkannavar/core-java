package com.xworkz.object;

public class Mic {
	
	double cost;
	
	int micNo;
	
	String brand;

	public Mic(double cost, int micNo, String brand) 
	{
		this.cost = cost;
		this.micNo = micNo;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Mic [cost=" + cost + ", micNo=" + micNo + ", brand=" + brand + "]";
	}
	
	@Override
	public int hashCode()
	{
		return 100;
	}
	
	

}
