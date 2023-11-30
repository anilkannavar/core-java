package com.xworkz.object;

public class Basket {
	
	String name;
	
	double cost;
	
	int basketno;

	public Basket(String name, double cost, int basketno) {
	
		this.name = name;
		this.cost = cost;
		this.basketno = basketno;
	}

	@Override
	public String toString() {
		return "Basket [name=" + name + ", cost=" + cost + ", basketno=" + basketno + "]";
	}
	
	@Override
	public int hashCode()
	{
		return 100;
	}

}
