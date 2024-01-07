package com.xworkz.CollectionMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.omg.IOP.TaggedComponentHelper;

public class Animal {
	
	public static void main(String[] args) {
		
		Collection<String> refCollection=new ArrayList<String>();
		Collection<String> refCollection1=new ArrayList<String>();

		
		refCollection.add("WildAnimals");
		refCollection.add("Pet Animals");
		refCollection.add("All Animals");
		
		System.out.println("after creating refcollection :"+refCollection);
		
		refCollection1.add("cat");
		refCollection1.add("dog");
		refCollection1.add("elephant");
		
		System.out.println("after creating refcollection1 :"+refCollection1);
		System.out.println("*******************");

		
		boolean value=refCollection.isEmpty();
		System.out.println(value);
		System.out.println("*******************");
			
	    int value1=refCollection.size();
		System.out.println(value1);
		System.out.println("*******************");

        boolean valueString=refCollection.equals(refCollection);
		System.out.println(valueString);
		System.out.println("*******************");

		System.out.println("the contains list is :"+refCollection);
		boolean result=refCollection.contains("WildAnimals");
        System.out.println("Is wild animals present in refcollection:"+result);
		System.out.println("*******************");

            
        boolean resultall=Collections.addAll(refCollection, "Camel", "Elphant", "Cow");
            
        for (String e : refCollection)
        {
          System.out.println(e);
        }
          System.out.println("**********************");
            
        boolean isRemoved=refCollection.removeAll(refCollection);
        System.out.println("After removing refcollection1 in collections :"+isRemoved);
        System.out.println("*******************");
        
        boolean setResult=refCollection.containsAll(refCollection);
        System.out.println(setResult);
        System.out.println("*******************");
        
        refCollection.addAll(refCollection1);
        for (String e : refCollection)
        {
          System.out.println(e);
        }
        System.out.println(refCollection);
        boolean set=refCollection.retainAll(refCollection1);
        for (String e : refCollection1)
        {
          System.out.println(e);
        }
        
        System.out.println(set);
        System.out.println("**************");
        
        Object[] refObjects=refCollection.toArray();
        for(int i=0;i<refObjects.length;i++)
        {
        	System.out.println(refObjects[i]+" ");
        }

        
            
            
            
            }
	
	
			

	} 
				
	


