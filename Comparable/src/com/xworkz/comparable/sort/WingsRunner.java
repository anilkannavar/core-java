package com.xworkz.comparable.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.ToyDTO;
import com.xworkz.comparable.WingsDTO;

public class WingsRunner {
	
	public static void main(String[] args) {
		
		WingsDTO wingsDto=new WingsDTO("SPARROW", 40, 'M', "india");
		WingsDTO wingsDto1=new WingsDTO("PIGEON", 35, 'S', "davangere");
		WingsDTO wingsDto2=new WingsDTO("PARROT", 10, 'L', "belgaum");
		WingsDTO wingsDto3=new WingsDTO("PENGIUN", 20, 'X', "bijapur");
		WingsDTO wingsDto4=new WingsDTO("DUCK", 60, 'l', "shivamogga");

		List<WingsDTO> list=new ArrayList<>();
		list.add(wingsDto);
		list.add(wingsDto1);
		list.add(wingsDto2);
		list.add(wingsDto3);
		list.add(wingsDto4);

		Collections.sort(list);
		for(WingsDTO ref:list) {
			System.out.println(ref);
	}
		Collections.sort(list,(o1,o2)->o2.getName().compareTo(o1.getName()));
		System.out.println("after sorting name in descending order");
		for(WingsDTO ref:list) {
			System.out.println(ref);


		}
}
}
