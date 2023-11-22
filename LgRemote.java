class LgRemote extends Remote
{
	int warrenty;
	int totalBatteries;
	
	
	LgRemote(int totalButtons,String original,int warrenty,int totalBatteries)
	{
		super(totalButtons,original);
		this.warrenty=warrenty;
		this.totalBatteries=totalBatteries;
		System.out.println("creating warrenty and totalBatteries in LgRemote");
		System.out.println("totalButtons:"+totalButtons);
		System.out.println("original:"+original);
		System.out.println("warrenty:"+warrenty);
		System.out.println("totalBatteries:"+totalBatteries);

	}
	void voiceCommand()
	{
		System.out.println("running voiceCommand iin LgRemote");
	}
	
	@Override
	void on()
	{
		System.out.println("the overirde methos has been created");
	    System.out.println("the method on has been created by using override");
    }
	
	@Override
	void off()
	{
		System.out.println("the overirde method has been created");
	    System.out.println("the method off has been created by using override");
	}
	
}