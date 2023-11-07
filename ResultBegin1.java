class ResultBegin1
{
	public static void main(String[] args)
	{
		System.out.println("Starting showInfo in Player");
		Tent tent=new Tent();
		Agent agent=new Agent();
		agent.openTent(tent);
		agent.closeTent(tent);
		agent.showInfo();
		Game game=new Game();
		Player player=new Player();
		player.showInfo();
	    System.out.println("ending showInfo in showInfo");

	}
}