package com.xworkz.object;

public class Lens {
	
	String brand;
	
	double cost;
	
	int size;
	
	public Lens(String brand,double cost,int size)
	{
		this.brand=brand;
		this.cost=cost;
		this.size=size;
		System.out.println("creating brand,cost and size in lens");
	}

	@Override
	public String toString() {
		return "Lens [brand=" + brand + ", cost=" + cost + ", size=" + size + "]";
	}
	
	@Override
	public int hashCode()
	{
		return 100;
	}
	
	

}
