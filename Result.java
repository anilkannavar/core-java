class Result
{
  public static void main(String[] args)
  {
	  System.out.println("Running main in Result");
	  
	  Speaker speaker=new Speaker(100);
	  Tv tv=new Tv(speaker,"LED");
	  tv.showInfo();
	  
	  MenuCard menucard=new MenuCard(2,500);
	  Hotel hotel=new Hotel(menucard,"RNR","Anil");
	  hotel.showInfo();
	  
	  Job job=new Job();
	  Comapny comapny=new Comapny(job);
	  comapny.showInfo();
	  
	  System.out.println("Ending main in Result");

  }
}