class ToughenedGlass extends Glass
{
	double weight;
	String ownerName;
	
	ToughenedGlass(int length,double thickness,String usage,String brand,GlassType type,double cost,int warrenty,double weight,String ownerName)
	{
		super(length,thickness,usage,brand,type);
		this.weight=weight;
		this.ownerName=ownerName;
		System.out.println("creating cost and warrenty in LaminatedGlass");
		System.out.println("lenght:"+this.length);
		System.out.println("thickness:"+this.thickness);
		System.out.println("usage:"+this.usage);
		System.out.println("brand:"+this.brand);
		System.out.println("type:"+this.type);
		System.out.println("cost:"+cost);
		System.out.println("warrenty:"+warrenty);
		System.out.println("weight:"+this.weight);
		System.out.println("ownerName:"+this.ownerName);

  
	}
}