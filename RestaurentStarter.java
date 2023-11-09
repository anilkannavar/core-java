class RestaurentStarter
{
  public static void main(String[] args)
  {
	  System.out.println("Running main in RestaurentStarter");
	  
	  Restaurent restaurent=new Restaurent("Vivek");
	  String[] items={"Naan","Butter chicken","tandoori","gulab jamun","egg rice"};
	  Restaurent restaurent1=new Restaurent(items);
	  restaurent1.showInfo();

      	  
  }
}