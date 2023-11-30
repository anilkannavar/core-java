package com.xworkz.object;

public class Chain {
	
	double cost;
	
	String company;
	
	int no;

	public Chain(double cost, String company, int no) 
	{
		
		this.cost = cost;
		this.company = company;
		this.no = no;
	}

	@Override
	public String toString() {
		return "Chain [cost=" + cost + ", company=" + company + ", no=" + no + "]";
	}
	
	@Override
	public int hashCode()
	{
		return 100;
	}
	

}
