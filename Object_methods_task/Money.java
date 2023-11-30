package com.xworkz.object;

public class Money {
	
	String country;
	
	String moneyname;
	
	int cost;

	public Money(String country, String moneyname, int cost) {
		
		this.country = country;
		this.moneyname = moneyname;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Money [country=" + country + ", moneyname=" + moneyname + ", cost=" + cost + "]";
	}
	
	@Override
	public int hashCode()
	{
		return 100;
	}

}
