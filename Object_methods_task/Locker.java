package com.xworkz.object;

public class Locker {
	
	double cost;
	
	int size;
	
	String name;

	public Locker(double cost, int size, String name) 
	{
	
		this.cost = cost;
		this.size = size;
		this.name = name;
		System.out.println("creating name,cost and size in lens");

	}

	@Override
	public String toString() 
	{
		return "Locker [cost=" + cost + ", size=" + size + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode()
	{
		return 100;
	}
	

}
