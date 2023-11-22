class RemoteStarter
{
	public static void main(String... args)
	{
		System.out.println("Running main in RemoteStarter");
		
		LgRemote lgremote=new LgRemote(34,"yes",2,2);
		lgremote.on();
		lgremote.off();
		lgremote.increaseVolume();
		lgremote.decreaseVolume();
		lgremote.changeVolume();
		System.out.println("ending main in RemoteStarter");

	}
}