class Rocket
{
  long speed;
  String spaceStation;
  String country;
  float cost;
  
  Rocket()
  {
	  super();
	  System.out.println("Rocket has been created");
  }
  Rocket(long speed)
  {
	  super();
	  System.out.println("speed has been created:"+speed);
	  this.speed=speed;
  }
  Rocket(long speed,String spaceStation)
  {
	  super();
	  System.out.println("speed,spaceStation has been created:"+speed+","+spaceStation);
	  this.speed=speed;
	  this.spaceStation=spaceStation;
  }
  Rocket(long speed,String spaceStation,String country)
  {
	  super();
	  System.out.println("speed,spaceStation and country has been created:"+speed+","+spaceStation+","+country);
	  this.speed=speed;
	  this.spaceStation=spaceStation;
	  this.country=country;
  }
  Rocket(long speed,String spaceStation,String country,float cost)
  {
	  super();
	  System.out.println("speed,spaceStation and country has been created:"+speed+","+spaceStation+","+country+","+cost);
	  this.speed=speed;
	  this.spaceStation=spaceStation;
	  this.country=country;
	  this.cost=cost;
  }
}