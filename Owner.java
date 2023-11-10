class Owner
{
	String name;
	String email;
	Address permanentAddress;
	Address temporaryAddress;
	
	Owner(String name,String email,Address permanentAddress,Address temporaryAddress)
	{
		this.name=name;
		this.email=email;
		this.permanentAddress=permanentAddress;
		this.temporaryAddress=temporaryAddress;
	}
	void show()
	{
		System.out.println("Starting show in Owner");
	    System.out.println("name:"+this.name);
		System.out.println("email:"+this.email);
		System.out.println("permanentAddress:"+this.permanentAddress.street);
	    System.out.println("temporaryAddress:"+this.temporaryAddress.street);
        System.out.println("ending show in Owner");

	}
}