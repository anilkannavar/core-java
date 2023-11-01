class MakeupKit
{
  String brand;
  String item;
  double size;
  long companyContactNo;
  
  MakeupKit()
  {
	  super();
	  System.out.println("MakeupKit has been created");
  }
  MakeupKit(String brand)
  {
	  super();
	  System.out.println("brand has been created:"+brand);
	  this.brand=brand;
  }
  MakeupKit(String brand,String item)
  {
	  super();
	  System.out.println("brand,item has been created:"+brand+","+item);
	  this.brand=brand;
	  this.item=item;
  }
  MakeupKit(String brand,String item,double size)
  {
	  super();
	  System.out.println("brand,item and size has been created:"+brand+","+item+","+size);
	  this.brand=brand;
	  this.item=item;
	  this.size=size;
  }
  MakeupKit(String brand,String item,double size,long companyContactNo)
  {
	  super();
	  System.out.println("brand,item,size and companyhas been created:"+brand+","+item+","+size+","+companyContactNo);
	  this.brand=brand;
	  this.item=item;
	  this.size=size;
	  this.companyContactNo=companyContactNo;
  }
}