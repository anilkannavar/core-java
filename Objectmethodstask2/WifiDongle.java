package com.xworkz.anil;

public class WifiDongle {
	
	String brand;
	
	double transferRate;
	
	double itemWeight;

	public WifiDongle(String brand, double transferRate, double itemWeight) 
	{
		this.brand = brand;
		this.transferRate = transferRate;
		this.itemWeight = itemWeight;
		System.out.println("creating brand,transferrate,itemweight in WifiDongle");
		System.out.println("brand:"+brand);
		System.out.println("transferRate:"+transferRate);
		System.out.println("itemWeight:"+itemWeight);

	}
	
	@Override
	public boolean equals(Object obj)
	{
		WifiDongle leftside=this;
		if(obj!=null)
		{
			if(obj instanceof WifiDongle)
			{
				WifiDongle rightside=(WifiDongle)obj;
				if(leftside.itemWeight==rightside.itemWeight && leftside.transferRate==rightside.transferRate)
				{
					System.out.println("leftside and rightside are same");
					return true;
				}
				else
				{
					System.out.println("leftside and rightside are not same");

				}
			}
			else
			{
				System.out.println("obj is not a instance of WifiDongle");
            }
		}
		return false;
	}
	
}
