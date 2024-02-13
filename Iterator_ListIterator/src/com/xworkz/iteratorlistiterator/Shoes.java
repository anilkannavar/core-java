package com.xworkz.iteratorlistiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.random.RandomGenerator.ArbitrarilyJumpableGenerator;

public class Shoes {
	
	public static void main(String[] args) {
		
		List<String> addingshoes=new ArrayList<>();
		addingshoes.add("Puma");
		addingshoes.add("Adidas");
		addingshoes.add("Sparx");
		addingshoes.add("Reebok");
		addingshoes.add("Jorden");
		addingshoes.add("Nike");
		addingshoes.add("Woodland");
		addingshoes.add("Bata");
		addingshoes.add("New Balance");
		addingshoes.add("Fila");
		
		System.out.println("original list is:");
		addingshoes.forEach(res->System.out.println(res));
		System.out.println("=============================");
		
		System.out.println("forward list is:");
		ListIterator<String> listIterator=addingshoes.listIterator();
		while(listIterator.hasNext()) {
			 String refString=  listIterator.next();
			 System.out.println(refString);
			 }
		
		System.out.println("=========================");
		
		System.out.println("backward list is:");
		ListIterator<String> listIterator2=addingshoes.listIterator(addingshoes.size());
		 while(listIterator2.hasPrevious()) {
			String refString2=listIterator2.previous();
			System.out.println(refString2);
             }
		 
		System.out.println("=========================");
		
		System.out.println("after adding element in list is:");
		ListIterator<String> listIterator3=addingshoes.listIterator();
		while(listIterator3.hasNext()) 
		{
		 if("Jorden".equals(listIterator3.next())) 
		 {
			 listIterator3.add("sketchers");

		}

		}
		addingshoes.forEach(ref->System.out.println(ref));

		System.out.println("=========================");
		
		System.out.println("after removing element in list is:");
		ListIterator<String> listIterator4=addingshoes.listIterator(4);
		while(listIterator4.hasNext())
		{
			if ("Woodland".equals(listIterator4.next())) 
			{
				listIterator4.remove();
				
			}
		}
		addingshoes.forEach(ref->System.out.println(ref));
     }
       

}

