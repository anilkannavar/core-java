class Showroom
{
   String brand="tata";
   int showRoomNo=123;
   String address;
   double size;
   long contactNo=9807865798l;
   double carPrice;
   String carName="harrier";
   String manufatureCountry="India";
   

Showroom()
{
	System.out.println("Show room has been created");
}   
Showroom(String brand)
{
	System.out.println("brand name has been created"+brand);
	this.brand=brand;
}
Showroom(String brand,int showRoomNo)
{
	System.out.println("brand and showRoomNo has been created"+brand+","+showRoomNo);
	this.brand=brand;
	this.showRoomNo=showRoomNo;
}
Showroom(String brand,int showRoomNo,String address)
{
	System.out.println("brand,showRoomNo and address has been created"+brand+","+showRoomNo+","+address);
	this.brand=brand;
	this.showRoomNo=showRoomNo;
	this.address=address;
}
Showroom(String brand,int showRoomNo,String address,double size)
{
	System.out.println("brand,showRoomNo and address has been created"+brand+","+showRoomNo+","+address+","+size);
	this.brand=brand;
	this.showRoomNo=showRoomNo;
	this.address=address;
	this.size=size;
}
Showroom(String brand,int showRoomNo,String address,double size,long contactNo)
{
	System.out.println("brand,showRoomNo and address has been created"+brand+","+showRoomNo+","+address+","+size+","+contactNo);
	this.brand=brand;
	this.showRoomNo=showRoomNo;
	this.address=address;
	this.size=size;
	this.contactNo=contactNo;
}
Showroom(String brand,int showRoomNo,String address,double size,long contactNo,double carPrice)
{
	System.out.println("brand,showRoomNo and address has been created"+brand+","+showRoomNo+","+address+","+size+","+contactNo+","+carPrice);
	this.brand=brand;
	this.showRoomNo=showRoomNo;
	this.address=address;
	this.size=size;
	this.contactNo=contactNo;
	this.carPrice=carPrice;
}
Showroom(String brand,int showRoomNo,String address,double size,long contactNo,double carPrice,String carName)
{
	System.out.println("brand,showRoomNo and address has been created"+brand+","+showRoomNo+","+address+","+size+","+contactNo+","+carPrice+","+carName);
	this.brand=brand;
	this.showRoomNo=showRoomNo;
	this.address=address;
	this.size=size;
	this.contactNo=contactNo;
	this.carPrice=carPrice;
	this.carName=carName;
}
Showroom(String brand,int showRoomNo,String address,double size,long contactNo,double carPrice,String carName, String manufatureCountry)
{
	System.out.println("brand,showRoomNo and address has been created"+brand+","+showRoomNo+","+address+","+size+","+contactNo+","+carPrice+","+carName+","+manufatureCountry);
	this.brand=brand;
	this.showRoomNo=showRoomNo;
	this.address=address;
	this.size=size;
	this.contactNo=contactNo;
	this.carPrice=carPrice;
	this.carName=carName;
	this.manufatureCountry=manufatureCountry;
}
   
}