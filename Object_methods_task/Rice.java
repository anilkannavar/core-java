package com.xworkz.object;

public class Rice {
	
	String name;
	
	double quantity;
	
	int cost;

	public Rice(String name, double quantity, int cost) {
		
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Rice [name=" + name + ", quantity=" + quantity + ", cost=" + cost + "]";
	}
	
	@Override
	public int hashCode()
	{
		return 100;
	}

}
