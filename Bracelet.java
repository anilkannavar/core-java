class Bracelet
{
   String type;
   double size;
   long braceletNo;
   String comapanyName;
   int warrenty;
   
   Bracelet()
   {
	   System.out.println("Bracelet has been created");
   }
   Bracelet(String type)
   {
	   this.type=type;
	   System.out.println("type has been created:"+type);
   }
   Bracelet(String type,double size)
   {
	   this(type);
	   this.size=size;
	   System.out.println("type and size has been created:"+type+","+size);
   }
   Bracelet(String type,double size,long braceletNo)
   {
	   this(type,size);
	   this.braceletNo=braceletNo;
	   System.out.println("type,size and braceletNo has been created:"+type+","+size+","+braceletNo);
   }
   Bracelet(String type,double size,long braceletNo,String comapanyName)
   {
	   this(type,size,braceletNo);
	   this.comapanyName=comapanyName;
	   System.out.println("type,size,braceletNo and comapanyName has been created:"+type+","+size+","+braceletNo+","+comapanyName);
   }
   Bracelet(String type,double size,long braceletNo,String comapanyName,int warrenty)
   {
	   this(type,size,braceletNo,comapanyName);
	   this.warrenty=warrenty;
	   System.out.println("type,size,braceletNo and comapanyName and warrenty has been created:"+type+","+size+","+braceletNo+","+comapanyName+","+warrenty);
   }
}