package com.xworkz.comparable.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.FireCrackerDTO;
import com.xworkz.comparable.PinDTO;

public class FireCrcakerRunner {
	
	public static void main(String[] args) {
		
		FireCrackerDTO fireCrackerDto=new FireCrackerDTO("flower pot", 1590, 5, "555");
		FireCrackerDTO fireCrackerDto1=new FireCrackerDTO("ane pataki", 100, 57, "star");
		FireCrackerDTO fireCrackerDto2=new FireCrackerDTO("sur sur bathi", 850, 820, "dynamic");
		FireCrackerDTO fireCrackerDto3=new FireCrackerDTO("rocket", 1709, 45, "bosche");
		FireCrackerDTO fireCrackerDto4=new FireCrackerDTO("green bomb", 1950, 5, "lakshmi");

		List<FireCrackerDTO> list=new ArrayList<>();
		list.add(fireCrackerDto);
		list.add(fireCrackerDto1);
		list.add(fireCrackerDto2);
		list.add(fireCrackerDto3);
		list.add(fireCrackerDto4);

		Collections.sort(list);
		for(FireCrackerDTO ref:list) {
			System.out.println(ref);
		}
		Collections.sort(list,(o1,o2)->o2.getName().compareTo(o1.getName()));
		System.out.println("after sorting name in descending order");
		for(FireCrackerDTO ref:list) {
			System.out.println(ref);
	}
	}
}
