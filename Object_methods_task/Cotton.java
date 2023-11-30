package com.xworkz.object;

public class Cotton {
	
	String Company;
	
	int size;
	
	long no;

	public Cotton(String company, int size, long no) 
	{
		
		this.Company = company;
		this.size = size;
		this.no = no;
		System.out.println("creating company,size and no in lens");

	}

	@Override
	public String toString() {
		return "Cotton [Company=" + Company + ", size=" + size + ", no=" + no + "]";
	}
	
	@Override
	public int hashCode()
	{
		return 100;
	}
	
	

}
