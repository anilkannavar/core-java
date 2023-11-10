class Address
{
	String street;
	int pincode;
	City city;
	
	Address(String street,int pincode,City city)
	{
		this.street=street;
		this.pincode=pincode;
		this.city=city;
	}
	void show()
	{
		System.out.println("Starting show in Address");
		System.out.println("street:"+this.street);
		System.out.println("pincode:"+this.pincode);
		System.out.println("city:"+this.city.name);


        System.out.println("ending show in Address");

	}
}