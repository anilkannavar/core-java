package com.xworkz.anil;

public class Guiter {
	
	int id;
	
	double price;
	
	String material;

	public Guiter(int id, double price, String material) 
	{
	    this.id = id;
		this.price = price;
		this.material = material;
		System.out.println("creating id,price,material in Guiter");
		System.out.println("id:"+id);
		System.out.println("price:"+price);
		System.out.println("material:"+material);

	}
	
	@Override
	public boolean equals(Object obj)
	{
	Guiter leftside=this;
	if(obj!=null)
	{
		if(obj instanceof Guiter)
		{
			Guiter rightside=(Guiter)obj;
			if(leftside.id==rightside.id && leftside.price==rightside.price)
			{
				System.out.println("Guiter1 and Guiter2 are same");
				return true;
			}
			else
			{
				System.out.println("Guiter1 and Guiter2 are not same");
			}
			
		}
		else
		{
			System.out.println("obj is not instance of Guiter");
        }
		
	}
	return false;
	
	}	

}
