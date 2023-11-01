class ExampleStarter
{
  public static void main(String[] args)
  {
	  System.out.println("Running main in AllExamples");
	  
	  Clock clock=new Clock();
	  Clock clock1=new Clock(23);
	  Clock clock2=new Clock(23,"IST");
	  Clock clock3=new Clock(23,"IST","pendulam");
	  Clock clock4=new Clock(23,"IST","pendulam",120);
	  
	  Rocket rocket=new Rocket();
	  Rocket rocket1=new Rocket(456738l);
	  Rocket rocket2=new Rocket(456738l,"ISRO");
	  Rocket rocket3=new Rocket(456738l,"ISRO","INDIA");
	  Rocket rocket4=new Rocket(456738l,"ISRO","INDIA",234);
	  
	  MakeupKit makeupkit=new MakeupKit();
	  MakeupKit makeupkit1=new MakeupKit("NYKA");
	  MakeupKit makeupkit2=new MakeupKit("NYKA","Chemical");
	  MakeupKit makeupkit3=new MakeupKit("NYKA","Chemical",43);
	  MakeupKit makeupkit4=new MakeupKit("NYKA","Chemical",43,54678);
	  
	  Wallet1 wallet=new Wallet1();
	  Wallet1 wallet1=new Wallet1("Woodland");
	  Wallet1 wallet2=new Wallet1("Woodland","leather");
	  Wallet1 wallet3=new Wallet1("Woodland","leather",121);
	  Wallet1 wallet4=new Wallet1("Woodland","leather",121,"leather");
	  
	  Ornament ornamnet=new Ornament();
	  Ornament ornamnet1=new Ornament(435467l);
	  Ornament ornamnet2=new Ornament(435467l,"gold");
	  Ornament ornamnet3=new Ornament(435467l,"gold",56);
	  Ornament ornamnet4=new Ornament(435467l,"gold",56,67);
	  
	  System.out.println("Ending main in AllExamples");
	  
	  
  }
}