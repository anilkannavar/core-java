class Keyboard
{
   String brand="dell";
   String color;
   int noOfKeys=34;
   String type="querty";
   double cost;

Keyboard()
{
	System.out.println("keyboard created");
}
Keyboard(String brand)
{
	System.out.println("Brand has been created:"+brand);
	this.brand=brand;
}
Keyboard(String brand,String color)
{
	System.out.println("Brand and color has been created:"+brand+""+color);
	this.brand=brand;
	this.color=color;
}
Keyboard(String brand,String color,int noOfKeys)
{
	System.out.println("Brand , color and noOfKeys has been created:"+brand+","+color+","+noOfKeys);
	this.brand=brand;
	this.color=color;
	this.noOfKeys=noOfKeys;
}
Keyboard(String brand,String color,int noOfKeys,String type)
{
	System.out.println("Brand , color , noOfKeys has been created:"+brand+","+color+","+noOfKeys+","+type);
	this.brand=brand;
	this.color=color;
	this.noOfKeys=noOfKeys;
	this.type=type;
}
Keyboard(String brand,String color,int noOfKeys,String type,double cost)
{
	System.out.println("Brand , color , noOfKeys has been created:"+brand+","+color+","+noOfKeys+","+type+","+cost);
	this.brand=brand;
	this.color=color;
	this.noOfKeys=noOfKeys;
	this.type=type;
	this.cost=cost;
}
}


