class Mobile
{
	String brand;
	double cost;
	double width;
	int ram;
	double batteryCapacity;
	long imeiNo;
	double boxNo;
	double storage;
	int displaySize;
	String camera;
	
	Mobile(String brand,double cost,double width,int ram,double batteryCapacity,long imeiNo,double boxNo,double storage,int displaySize,String camera)
	{
		this.brand=brand;
		this.cost=cost;
		this.width=width;
		this.ram=ram;
		this.batteryCapacity=batteryCapacity;
		this.imeiNo=imeiNo;
		this.boxNo=boxNo;
		this.storage=storage;
		this.displaySize=displaySize;
		this.camera=camera;
		System.out.println("creating brand,cost,width,ram,batteryCapacity,imeiNo,price,storage,displaySize and camera");
		System.out.println("brand:"+brand);
		System.out.println("cost:"+cost);
		System.out.println("width:"+width);
		System.out.println("ram:"+ram);
		System.out.println("batteryCapacity:"+batteryCapacity);
		System.out.println("imeiNo:"+imeiNo);
		System.out.println("boxNo:"+boxNo);
		System.out.println("storage:"+storage);
		System.out.println("displaySize:"+displaySize);
		System.out.println("camera:"+camera);
	}
	void display()
	{
		System.out.println("running display in mobile");
	}
	void capacity()
	{
		System.out.println("running capacity in mobile");
    }
	void mobileSpeed()
	{
		System.out.println("running mobileSpeed in mobile");
    }
	void switchOffPhone()
	{
		System.out.println("running switchOffPhone in mobile");
    }
	void switchOnPhone()
	{
		System.out.println("running switchOnPhone in mobile");
    }
	void speed()
	{
		System.out.println("running speed in mobile");
    }
	void refreshrate()
	{
		System.out.println("running rdefreshrate in mobile");
    }
	void audiojack()
	{
		System.out.println("running audiojack in mobile");
    }
	void redmi()
	{
		System.out.println("running redmi in mobile");
    }
	void manufacturing()
	{
	    System.out.println("running manufacturing in mobile");
    }
}