class Carrom
{
   String name;
   double size;
   String type;
   int warrenty;
   String madeUpOf;
   
   Carrom()
   {
	   System.out.println("Carrom has been created");
   }
   Carrom(String name)
   {
	   this.name=name;
	   System.out.println("name has been created:"+name);
   }
   Carrom(String name,double size)
   {
	   this(name);
	   this.size=size;
	   System.out.println("name and size has been created:"+name+","+size);
   }
   Carrom(String name,double size,String type)
   {
	   this(name,size);
	   this.type=type;
	   System.out.println("name,size and type has been created:"+name+","+size+","+type);
   }
   Carrom(String name,double size,String type,int warrenty)
   {
	   this(name,size,type);
	   this.warrenty=warrenty;
	   System.out.println("name,size,type and warrenty has been created:"+name+","+size+","+type+","+warrenty);
   }
   Carrom(String name,double size,String type,int warrenty,String madeUpOf)
   {
	   this(name,size,type,warrenty);
	   this.madeUpOf=madeUpOf;
	   System.out.println("name,size,type and warrenty and madeUpOf has been created:"+name+","+size+","+type+","+warrenty+","+madeUpOf);
   }
}