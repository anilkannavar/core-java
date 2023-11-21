class Camera
{
	String brand;
	double pixel;
	int batteryDuration;
	Color color;
	
	
	Camera(String brand,double pixel,int batteryDuration,Color color)
	{
		this.brand=brand;
		this.pixel=pixel;
		this.batteryDuration=batteryDuration;
		this.color=color;
		System.out.println("creating brand,pixel,batteryDuration and color in Camera");
	}
}