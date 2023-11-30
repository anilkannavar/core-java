package com.xworkz.object;

public class Starter {
	
	public static void main(String... args)
	{
		System.out.println("Starting main in Starter");
		
		Lens lens=new Lens("lenskar",230,23);
		System.out.println("brand:"+lens.brand);
		System.out.println("cost:"+lens.cost);
		System.out.println("size:"+lens.size);
		
		Locker locker=new Locker(200,2,"link");
		System.out.println("cost:"+locker.cost);
		System.out.println("size:"+locker.size);
		System.out.println("name:"+locker.name);
		
		Cotton cotton=new Cotton("duroflex",3,234561l);
		System.out.println("Company:"+cotton.Company);
		System.out.println("size:"+cotton.size);
		System.out.println("no:"+cotton.no);
		
		Mic mic=new Mic(2300,1,"swing");
		System.out.println("cost:"+mic.cost);
		System.out.println("size:"+mic.micNo);
		System.out.println("brand:"+mic.brand);
		
		Heart heart=new Heart(2345,4567,"cardiology");
		System.out.println("heartrate:"+heart.heartrate);
		System.out.println("cholestrol:"+heart.cholestrol);
		System.out.println("stunt:"+heart.stunt);
		
		Seed seed=new Seed("sunflower",6755,34);
		System.out.println("seedname:"+seed.seedname);
		System.out.println("cost:"+seed.cost);
		System.out.println("packetno:"+seed.packetno);
		
		Bowl bowl=new Bowl(90,"prestige",200);
		System.out.println("bowlno:"+bowl.bowlno);
		System.out.println("brand:"+bowl.brand);
		System.out.println("cost:"+bowl.cost);
		
		Chain chain=new Chain(23000,"kalyan jewellers",78);
		System.out.println("cost:"+chain.cost);
		System.out.println("company:"+chain.company);
		System.out.println("no::"+chain.no);
		
		Geyser geyser=new Geyser("200litres",34500,687688388l);
		System.out.println("capacity:"+geyser.capacity);
		System.out.println("cost:"+geyser.cost);
		System.out.println("geyserno::"+geyser.geyserno);
		
		Spoon spoon=new Spoon(230,"rk",4567);
		System.out.println("cost:"+spoon.cost);
		System.out.println("brand:"+spoon.brand);
		System.out.println("size::"+spoon.size);
		
		Basket basket=new Basket("garbage collector",300,7890);
		System.out.println("name:"+basket.name);
		System.out.println("cost:"+basket.cost);
		System.out.println("basketno::"+basket.basketno);
		
		Bandli bandli=new Bandli(8,900,true);
		System.out.println("size:"+bandli.size);
		System.out.println("cost:"+bandli.cost);
		System.out.println("bandliusedFor::"+bandli.bandliused);
		
		Rice rice=new Rice("basumathi",100,78);
		System.out.println("name:"+rice.name);
		System.out.println("quantity:"+rice.quantity);
		System.out.println("cost::"+rice.cost);
		
		Money money=new Money("India","rupee",200);
		System.out.println("contry:"+money.country);
		System.out.println("moneyname:"+money.moneyname);
		System.out.println("cost::"+money.cost);
		
		Bucket bucket=new Bucket(3,"plastic",300);
		System.out.println("size:"+bucket.size);
		System.out.println("madeof:"+bucket.madeof);
		System.out.println("cost::"+bucket.cost);
		
		System.out.println("Ending main in Starter");

	}

}
