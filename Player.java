class Player
{
  String name="virat";
  Game game=new Game();
  
  void showInfo()
  {
	  System.out.println("Starting showInfo in Player");
	  System.out.println("name:"+name);
      game.play();
	  game.pause();
	  game.end();
	  System.out.println("ending showInfo in showInfo");

  }
}