class AllExample
{
 public static void main(String[] args)
 {
	 System.out.println("Running main in AllExample");
	 
	 Printer printer=new Printer();
	 Printer printer1=new Printer("hp");
	 Printer printer2=new Printer("hp",46);
	 Printer printer3=new Printer("hp",46,2);
	 Printer printer4=new Printer("hp",46,2,100);
	 Printer printer5=new Printer("hp",46,2,100,"colorprint");


	 Helmet helmet=new Helmet();
	 Helmet helmet1=new Helmet("v1");
     Helmet helmet2=new Helmet("v1",56);
	 Helmet helmet3=new Helmet("v1",56,2);
     Helmet helmet4=new Helmet("v1",56,2,"fibre");
     Helmet helmet5=new Helmet("v1",56,2,"fibre",34562l);
	 
	 
	 KeyChain keychain=new KeyChain();
	 KeyChain keychain1=new KeyChain(200);
     KeyChain keychain2=new KeyChain(200,"bike");
     KeyChain keychain3=new KeyChain(200,"bike","metal");
     KeyChain keychain4=new KeyChain(200,"bike","metal",30);
	 KeyChain keychain5=new KeyChain(200,"bike","metal",30,50);


     Bracelet bracelet=new Bracelet();
	 Bracelet bracelet1=new Bracelet("gold");
	 Bracelet bracelet2=new Bracelet("gold",200);
	 Bracelet bracelet3=new Bracelet("gold",200,35);
	 Bracelet bracelet4=new Bracelet("gold",200,35,"bhima");
	 Bracelet bracelet5=new Bracelet("gold",200,35,"bhima",1);
	 
	 
	 Carrom carrom=new Carrom();
	 Carrom carrom1=new Carrom("cosco");
	 Carrom carrom2=new Carrom("cosco",120);
	 Carrom carrom3=new Carrom("cosco",120,"wooden");
	 Carrom carrom4=new Carrom("cosco",120,"wooden",2);
	 Carrom carrom5=new Carrom("cosco",120,"wooden",2,"wood");

	 System.out.println("Ending main in AllExample");

	 

 }
}