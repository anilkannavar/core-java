class Glass
{
	int length;
	double thickness;
	String usage;
	String brand;
	GlassType type;
	
	Glass(int length,double thickness,String usage,String brand,GlassType type)
	{
		this.length=length;
		this.thickness=thickness;
		this.usage=usage;
		this.brand=brand;
		this.type=type;
		System.out.println("creating length,thickness,usage,brand and type");
	}
	
}