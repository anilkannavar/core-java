class Remote
{
	int totalButtons;
	String original;
	
	
	Remote(int totalButtons,String original)
	{
		this.totalButtons=totalButtons;
		this.original=original;
		System.out.println("creating totalButtons and original in REmote");	  	
	}
	void on()
	{
		System.out.println("running on in Remote");
	}
	void off()
	{
		System.out.println("running off in remote");
	}
	void increaseVolume()
	{
		System.out.println("running increaseVolume in remote");
    }
	void decreaseVolume()
	{
		System.out.println("running decreaseVolume in remote");
    }
	void changeVolume()
	{
	    System.out.println("running changeVolume in remote");
    }
	
}