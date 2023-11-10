class Laptop
{
	Hardware[] hardware;
	String owner;
	Brand brand;
	
	Laptop(Hardware[] hardware,String owner,Brand brand)
	{
		this.hardware=hardware;
		this.owner=owner;
		this.brand=brand;
	}
	void show()
	{
		System.out.println("Starting show in Laptop");
		System.out.println("owner:"+this.owner);
		System.out.println("brand:"+this.brand);
		System.out.println("hardware:"+this.hardware);
		if(this.hardware!=null)
		{
			for(int index=0;index<this.hardware.length;index++)
			{
				Hardware ref=hardware[index];
				ref.showInfo();
				System.out.println(ref.name);
			}
		}
        System.out.println("ending show in Laptop");

	}
}