class Hardware
{
	String name;
	String type;
	Brand brand;
	
	Hardware(String name,String type,Brand brand)
	{
		this.name=name;
		this.type=type;
		this.brand=brand;
	}
	void showInfo()
	{
		System.out.println("Starting showInfo in Hardware");
		System.out.println("name:"+this.name);
		System.out.println("type:"+this.type);
		System.out.println("brand:"+this.brand.name);
        System.out.println("ending showInfo in Hardware");
    }
}