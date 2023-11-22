class MobileStarter
{
	public static void main(String... args)
	{
		System.out.println("Starting main in MobileStarter");
		
		Mobile mobile=new Mobile("samsung",23000,23,4,4500,2345618978l,234,128,16,"wide engel");
		mobile.display();
		mobile.capacity();
		mobile.mobileSpeed();
		mobile.switchOffPhone();
		mobile.switchOnPhone();
		mobile.speed();
		mobile.refreshrate();
		mobile.audiojack();
		mobile.redmi();
		mobile.manufacturing();
		

		IphoneMobile iphonemobile=new IphoneMobile("samsung",23000,23,4,4500,2345618978l,234,128,16,"wide engel","steve jobs","apple");
		iphonemobile.companyFounder();
		iphonemobile.companyCapacity();
		iphonemobile.validity();
		iphonemobile.generation();
		iphonemobile.display();
		iphonemobile.capacity();
		iphonemobile.switchOffPhone();
		iphonemobile.switchOnPhone();
		
		System.out.println("Ending main in MobileStarter");

	}
}