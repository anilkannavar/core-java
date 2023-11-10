class Brand
{
	String name;
	String origin;
	String ceoName;
	City[] city;
	
	Brand(String name,String origin,String ceoName,City[] city)
	{
		this.name=name;
		this.origin=origin;
		this.ceoName=ceoName;
		this.city=city;
	}
	void show()
	{
        System.out.println("Starting show in brand");
		System.out.println("name:"+this.name);
		System.out.println("origin:"+this.origin);
		System.out.println("ceoName:"+this.ceoName);
		System.out.println("city:"+this.city);
		if(this.city!=null)
		{
			for(int seq=0;seq<this.city.length;seq++)
			{
			    City cities=city[seq];
				cities.show();
			}
		}
        System.out.println("ending show in brand");

	}
}