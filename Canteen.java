class Canteen
{
  String type;
  String[] utensils;
  
  Canteen(String type)
  {
	  this.type=type;
  }
  Canteen(String[] utensils)
  {
	  this.utensils=utensils;
  }
  void showInfo()
  {
	  System.out.println("Starting showInfo in Canteen");
	  System.out.println("type:"+this.type);
  }
  void display()
  {
	  	  System.out.println("utensils:"+this.utensils);
  
	  if(this.utensils!=null)
	  {
		  for(int index=0;index<this.utensils.length;index++)
		  {
			  String values=utensils[index];
			  System.out.println("values:"+values);
		  }
	  }
		  else
		  {
			  System.out.println("values has been not in order");
		  }
		  	  System.out.println("ending showInfo in Canteen");
	  }
  }
