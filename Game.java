class Game
{
 int id=21;
 String name="kabaddi";
 String origin="india";
 
 enum totalPlayers
 {
	 ONE,TWO,THREE;
 }
 void play()
 {
	System.out.println("Starting play in Game");
	System.out.println("Play function has been created");
	System.out.println("ending play in Game");
 }
 void pause()
 {
	System.out.println("Starting pause in Game");
	System.out.println("pause function has been created");
	System.out.println("ending pause in Game");
 }
 void end()
 {
	System.out.println("Starting end in Game");
	System.out.println("end function has been created");
	System.out.println("ending end in Game");
 }
 void showInfo()
 {
	System.out.println("Starting showInfo in Game");
	System.out.println("id:"+id);
	System.out.println("name:"+name);
	for(int i=0;i<3;i++)
	{
		System.out.println(totalPlayers.values()[i]);
	}
	play();
	pause();
	end();
    System.out.println("ending showInfo in Game");


	 
 }
 
}