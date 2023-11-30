package com.xworkz.object;

public class Heart {
	
	double heartrate;
	
	double cholestrol;
	
	String stunt;

	public Heart(double heartrate, double cholestrol, String stunt) 
	{
	
		this.heartrate = heartrate;
		this.cholestrol = cholestrol;
		this.stunt = stunt;
	}

	@Override
	public String toString() {
		return "Heart [heartrate=" + heartrate + ", cholestrol=" + cholestrol + ", stunt=" + stunt + "]";
	}
	
    @Override
    public int hashCode()
    {
    	return 100;
    }

}
