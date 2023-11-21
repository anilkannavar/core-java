class DigitalCamera extends Camera
{
	DigitalCamera(String brand,double pixel,int batteryDuration,Color color)
	{
		super(brand,pixel,batteryDuration,color);
		System.out.println("brand:"+this.brand);
		System.out.println("pixel:"+this.pixel);
		System.out.println("batteryDuration:"+this.batteryDuration);
		System.out.println("color:"+this.color);
		
	}
}