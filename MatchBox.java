class MatchBox
{
    String brand;
	int noOfStick=120;
	int length;
	double price=2.5;
	int size;
	double weight;
	String type="wood";
	

MatchBox()
{
	System.out.println("Constructor MatchBox has been created");
}
MatchBox(String brand)
{
	System.out.println("brand of matchbox has been created"+brand);
	this.brand=brand;
}
MatchBox(String brand,int noOfStick)
{
	System.out.println("brand and noOfStick has been created"+brand+","+noOfStick);
	this.brand=brand;
	this.noOfStick=noOfStick;
}
MatchBox(String brand,int noOfStick,int length)
{
	System.out.println("brand,noOfStick and length has been created"+brand+","+noOfStick+"," +length);
	this.brand=brand;
	this.noOfStick=noOfStick;
	this.length=length;
}
MatchBox(String brand,int noOfStick,int length,double price)
{
	System.out.println("brand,noOfStick and length has been created"+brand+"," +noOfStick+ "," +length+ "," +price);
	this.brand=brand;
	this.noOfStick=noOfStick;
	this.length=length;
	this.price=price;
}
MatchBox(String brand,int noOfStick,int length,double price,int size)
{
	System.out.println("brand,noOfStick and length has been created"+brand+ "," +noOfStick+ "," +length+ "," +price+ "," +size);
	this.brand=brand;
	this.noOfStick=noOfStick;
	this.length=length;
	this.price=price;
	this.size=size;
}
MatchBox(String brand,int noOfStick,int length,double price,int size,double weight)
{
	System.out.println("brand,noOfStick and length has been created"+brand+ "," +noOfStick+ "," +length+ "," +price+ "," +size+","+weight);
	this.brand=brand;
	this.noOfStick=noOfStick;
	this.length=length;
	this.price=price;
	this.size=size;
}
MatchBox(String brand,int noOfStick,int length,double price,int size,double weight,String type)
{
	System.out.println("brand,noOfStick and length has been created"+brand+ "," +noOfStick+ "," +length+ "," +price+ "," +size+","+weight+","+type);
	this.brand=brand;
	this.noOfStick=noOfStick;
	this.length=length;
	this.price=price;
	this.size=size;
}
}

