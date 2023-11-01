class Printer
{
   String brand;
   int printerNo;
   int warrenty;
   double noOfPages;
   String type;
   
   Printer()
   {
	   System.out.println("Printer has been created");
   }
   Printer(String brand)
   {
	   this.brand=brand;
	   System.out.println("brand has been craeted"+brand);
   }
   Printer(String brand,int printerNo)
   {
	   this(brand);
	   this.printerNo=printerNo;
	   System.out.println("brand,printerNo has been craeted"+brand+","+printerNo);
   }
   Printer(String brand,int printerNo,int warrenty)
   {
	   this(brand,printerNo); 
	   this.warrenty=warrenty;
	   System.out.println("brand,printerNo and warrenty has been craeted"+brand+","+printerNo+","+warrenty);
   }
   Printer(String brand,int printerNo,int warrenty,double noOfPages)
   {
	   this(brand,printerNo,warrenty);
	   this.noOfPages=noOfPages;
	   System.out.println("brand,printerNo and noOfPages  warrenty has been craeted"+brand+","+printerNo+","+warrenty+","+noOfPages);
   }
   Printer(String brand,int printerNo,int warrenty,double noOfPages,String type)
   {
	   this(brand,printerNo,warrenty,noOfPages);
	   this.type=type;
	   System.out.println("brand,printerNo and warrenty has been craeted"+brand+","+printerNo+","+warrenty+","+noOfPages+","+type);
   }
   
  
}