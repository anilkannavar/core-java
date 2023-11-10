class AllStarter
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in AllStarter");
		
		
		
		City city=new City("davangere","karnataka");
		city.show();
		City city1=new City("chd","karnataka");
		city1.show();
		City city2=new City("hbl","karnataka");
		city2.show();
		City city3=new City("rnr","karnataka");
		city3.show();
		City city4=new City("bng","karnataka");
		city4.show();
		
		City[] place={city,city1,city2,city3,city4};
		
		Address address=new Address("pj extension",789065,city);
		address.show();
		Address address1=new Address("pj extension",789065,city);
		address1.show();
		
		
		Brand brand=new Brand("dell","china","karan",place);
		brand.show();
		Brand brand1=new Brand("lenovo","china","sam",place);
		brand1.show();
		Brand brand2=new Brand("asus","china","john",place);
		brand2.show();
		Brand brand3=new Brand("asus","china","japan",place);
		brand3.show();
		Brand brand4=new Brand("apple","us","charlie",place);
		brand4.show();
		
		
		
		Hardware hardware=new Hardware("monitor","plastic",brand);
		hardware.showInfo();
		Hardware hardware1=new Hardware("USB","plastic",brand);
		hardware1.showInfo();
		Hardware hardware2=new Hardware("CPU","plastic",brand);
		hardware2.showInfo();
		Hardware hardware3=new Hardware("MONITOR","plastic",brand);
		hardware3.showInfo();
		Hardware hardware4=new Hardware("MOTHERBOARD","plastic",brand);
		hardware4.showInfo();
		Hardware hardware5=new Hardware("MOUSE","plastic",brand);
		hardware5.showInfo();
		Hardware hardware6=new Hardware("PRINTER","plastic",brand);
		hardware6.showInfo();
		Hardware hardware7=new Hardware("LAPTOP","plastic",brand);
		hardware7.showInfo();
		Hardware hardware8=new Hardware("FAN","plastic",brand);
		hardware8.showInfo();
		Hardware hardware9=new Hardware("DVD","plastic",brand);
		hardware9.showInfo();
		
		Hardware[] value={hardware,hardware1,hardware2,hardware3,hardware4,hardware5,hardware6,hardware7,hardware8,hardware9};
		
		Owner owner=new Owner("Arjun","arjun@gmail.com",address,address1);
		owner.show();
		
		Laptop laptop=new Laptop(value,"Anil",brand);
		laptop.show();
		
	    System.out.println("ending main in AllStarter");

	}
}