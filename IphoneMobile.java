class IphoneMobile extends Mobile
{
	String founder;
	String brand1;
	
	
	IphoneMobile(String brand1,double cost,double width,int ram,double batteryCapacity,long imeiNo,double boxNo,double storage,int displaySize,String camera,String founder,String brand)
	{
		super(brand,cost,width,ram,batteryCapacity,imeiNo,boxNo,storage,displaySize,camera);
		this.founder=founder;
		this.brand1=brand1;
		System.out.println("founder:"+this.founder);
		System.out.println("brand:"+this.brand1);
    }
	void companyFounder()
	{
		System.out.println("running companyFounder in mobile");
    }
	void companyCapacity()
	{
		System.out.println("running companyCapacity in mobile");
    }
	void validity()
	{
		System.out.println("running validity in mobile");
    }
	void generation()
	{
	    System.out.println("running generation in mobile");
    }
	
	@Override
	void display()
	{
		System.out.println("override method has been created ");
		System.out.println("display override statement has been created");
	}
	
	@Override
	void capacity()
	{
		System.out.println("override method has been created ");
		System.out.println("capacity override statement has been created");
	}
	
	@Override
	void switchOffPhone()
	{
		System.out.println("override method has been created ");
		System.out.println("swithOffPhone override statement has been created");
	}
	
	@Override
	void switchOnPhone()
	{
		System.out.println("override method has been created ");
		System.out.println("swithOnPhone override statement has been created");
	}
}