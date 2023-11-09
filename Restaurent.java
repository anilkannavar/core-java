class Restaurent
{
  String ownerName;
  String[] specialItems;
  
  Restaurent(String ownerName)
  {
	  this.ownerName=ownerName;
  }
  Restaurent(String[] specialItems)
  {
	  this.specialItems=specialItems;
  }
  void showInfo()
  {
	  System.out.println("Starting showInfo in Restaurent");
	  System.out.println("ownerName:"+this.ownerName);
	  System.out.println("specialItems:"+this.specialItems);
	  if(this.specialItems!=null)
	  {
		  for(int seq=0;seq<this.specialItems.length;seq++)
		  {
			  String items=specialItems[seq];
			  System.out.println("items"+items);
		  }
	  }else
		  {
			  System.out.println("seq not correct");
		  }
	     System.out.println("ending showInfo in Restaurent");
  }
  }
