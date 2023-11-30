package com.xworkz.object;

public class Spoon {
	
	int cost;
	
	String brand;
	
	double size;

	public Spoon(int cost, String brand, double size) {
	
		this.cost = cost;
		this.brand = brand;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Spoon [cost=" + cost + ", brand=" + brand + ", size=" + size + "]";
	}
	
	@Override
	public int hashCode()
	{
		return 100;
	}

}
