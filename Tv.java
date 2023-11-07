class Tv
{
   Speaker speaker;
   String display;
   
   Tv(Speaker speaker,String display)
  {
	  this.speaker=speaker;
	  this.display=display;
  }
   
   void showInfo()
  {
	  System.out.println("Starting display in Speaker");
	  System.out.println("maxVolume:"+speaker.maxVolume);
	  System.out.println("display:"+display);
      System.out.println("Ending display in Speaker");

  }
}