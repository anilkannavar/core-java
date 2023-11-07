class Agent
{
  int id=200;
  String name="Anil";
  String comapny="tcs";
  Tent tent;
  void openTent(Tent tent)
  {
	  this.tent=tent;
	  System.out.println("Starting openTent in Agent");
	  System.out.println("slNo:"+tent.slNo);
      System.out.println("width:"+tent.width);
	  System.out.println("height:"+tent.height);
	  System.out.println("ending openTent in Agent");
      tent.open();
	  }
  void closeTent(Tent tent)
  {
	  this.tent=tent;
	  System.out.println("Starting closeTent in Agent");
	  System.out.println("slNo:"+tent.slNo);
      System.out.println("width:"+tent.width);
	  System.out.println("height:"+tent.height);
	  System.out.println("ending closeTent in Agent");
	  tent.close();
  }
  void showInfo()
  {
	  System.out.println("Starting showInfo in Agent");
	  openTent(tent);
	  closeTent(tent);
	  System.out.println("id:"+id);
      System.out.println("Ending showInfo in Agent");

  }
}