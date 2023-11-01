class Helmet
{
  String brand;
  double size;
  int warrenty;
  String type;
  long helmetMarkNo;
  
  Helmet()
  {
	  System.out.println("Helmet has been created");
  }
  Helmet(String brand)
  {
	  this.brand=brand;
	  System.out.println("brand has been created"+brand);
  }
  Helmet(String brand,double size)
  {
	  this(brand);
	  this.size=size;
	  System.out.println("brand and size has been created"+brand+","+size);
  }
  Helmet(String brand,double size,int warrenty)
  {
	  this(brand,size);
	  this.warrenty=warrenty;
	  System.out.println("brand,size and warrenty has been created"+brand+","+size+","+warrenty);
  }
  Helmet(String brand,double size,int warrenty,String type)
  {
	  this(brand,size,warrenty);
	  this.type=type;
	  System.out.println("brand,size and warrenty and type has been created"+brand+","+size+","+warrenty+","+type);
  }
  Helmet(String brand,double size,int warrenty,String type,long helmetMarkNo)
  {
	  this(brand,size,warrenty,type);
	  this.helmetMarkNo=helmetMarkNo;
	  System.out.println("brand,size,warrenty and type and helmetMarkNo has been created"+brand+","+size+","+warrenty+","+type+","+helmetMarkNo);
  }
}