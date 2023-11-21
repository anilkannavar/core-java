class LaminatedGlass extends Glass
{
	double cost;
	int warrenty;
	
	LaminatedGlass(int length,double thickness,String usage,String brand,GlassType type,double cost,int warrenty)
	{
		super(length,thickness,usage,brand,type);
		this.cost=cost;
		this.warrenty=warrenty;
		System.out.println("creating cost and warrenty in LaminatedGlass");
		System.out.println("lenght:"+this.length);
		System.out.println("thickness:"+this.thickness);
		System.out.println("usage:"+this.usage);
		System.out.println("brand:"+this.brand);
		System.out.println("type:"+this.type);
		System.out.println("cost:"+this.cost);
		System.out.println("warrenty:"+this.warrenty);
    }
}