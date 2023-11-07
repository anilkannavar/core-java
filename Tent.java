class Tent
{
  int slNo=10;
  double width=100, height=200;


  enum Color
  {
	  RED,SAFFRON,GREEN,BLUE,YELLOW;
  }
  boolean open()
  {
	  System.out.println("Starting open in Tent");
	  System.out.println("Open has been created");
	  System.out.println("ending open in Tent");
	  return false;
  }
  boolean close()
  {
	  System.out.println("Starting close in Tent");
	  System.out.println("close has been created");
      System.out.println("Ending close in Tent");
	  return false;

  }
void showInfo()
{
	  System.out.println("Starting showInfo in Tent");
	  System.out.println("slNo:"+slNo);
	  for(int i=0;i<5;i++)
	  {
		  System.out.println(Color.values()[i]);
	  }
	  System.out.println("width:"+width);
	  System.out.println("height:"+height);
	  open();
	  close();
	  System.out.println("Ending showInfo in Tent");
} 
} 