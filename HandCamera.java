class HandCamera extends Camera
{
	double weight;
	
	
	HandCamera(String brand,double pixel,int batteryDuration,Color color,double weight)
	{
		super(brand,pixel,batteryDuration,color);
		this.weight=weight;
		System.out.println("brand:"+this.brand);
		System.out.println("pixel:"+this.pixel);
		System.out.println("batteryDuration:"+this.batteryDuration);
		System.out.println("color:"+this.color);
		System.out.println("weight:"+this.weight);

	}
}