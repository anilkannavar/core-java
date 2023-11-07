class Hotel
{
  MenuCard menucard;
  String name;
  String ownerName;
  
  Hotel(MenuCard menucard,String name,String ownerName)
  {
	  this.menucard=menucard;
	  this.name=name;
	  this.ownerName=ownerName;
  }
  void showInfo()
  {
	  	  System.out.println("Starting display in MenuCard");
		  System.out.println("name:"+name);
		  System.out.println("ownerName:"+ownerName);
		  System.out.println("totalItems:"+menucard.totalItems);
		  System.out.println("cost:"+menucard.cost);
          System.out.println("Ending display in MenuCard");

  }
}