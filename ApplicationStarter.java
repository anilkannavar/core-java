class ApplicationStarter
{
	public static void main(String... args)
	{
		System.out.println("Starting main in ApplicationStarter");
		
		Application application=new Application(1,"Amzon",546,"Jeff Bezos","21-0ct-1987",TypeCode.SHOPPINGAPPAPPLICATION);
		application.showInfo();
		
		StandaloneApplication standaloneapplication=new StandaloneApplication(2,"Flipkart",674,"Sachin Bansal","11-dec-2009",TypeCode.WEBAPPLICATION,450,"Amazon",Os.NETWORKOS);
		standaloneapplication.display();
		
		WebApplication webapplication=new WebApplication(3,"Myntra",555,"Mukesh Bansal","23-jan-2007",TypeCode.STANDALONEAPPLICATION,555,"Flip kart",Os.DISTRIBUTEDOS,true);
		webapplication.show();
		
		Browser browser=new Browser(4,"Ajio",582,"mukesh ambani","11-jun-2012",TypeCode.SHOPPINGAPPAPPLICATION,544,"Myntra",Os.BATCHOS);
		browser.showDisplay();
		
		MediaPlayer mediaplayer=new MediaPlayer(5,"Decathlon",12,"anil","24-jan-jul",TypeCode.STANDALONEAPPLICATION,436,"Amzon",Os.TIMEOS);
		mediaplayer.showDetails();
		
		ChromeBrowser chromebrowser=new ChromeBrowser();
		chromebrowser.settings();
		chromebrowser.displayhistory();
		chromebrowser.consumerMemory();
		chromebrowser.consumerInternet();
		chromebrowser.run();
	
		
		EdgeBrowser edgebrowser=new EdgeBrowser();
		edgebrowser.settings();
		edgebrowser.displayhistory();
		edgebrowser.consumerMemory();
		edgebrowser.consumerInternet();
		edgebrowser.run();
		

        FireFoxBrowser firefoxbrowser=new FireFoxBrowser();
		firefoxbrowser.settings();
		firefoxbrowser.displayhistory();
		firefoxbrowser.consumerMemory();
		firefoxbrowser.consumerInternet();
		firefoxbrowser.run();
		
		
		System.out.println("Ending main in ApplicationStarter");
    }
}