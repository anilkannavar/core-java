package com.xworkz.comparable.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.WatchDTO;

public class WatchRunner {
	
	public static void main(String[] args) {
		
		WatchDTO watchDTO=new WatchDTO("fastrack", "US", 23000, 100);
		WatchDTO watchDTO1=new WatchDTO("sonata", "japan", 11000, 180);
		WatchDTO watchDTO2=new WatchDTO("tata", "india", 89000, 300);
		WatchDTO watchDTO3=new WatchDTO("rolex", "US", 600000, 370);
		WatchDTO watchDTO4=new WatchDTO("gshock", "south korea", 65000, 200);
		
		List<WatchDTO> list=new ArrayList<WatchDTO>();
		list.add(watchDTO);
		list.add(watchDTO1);
		list.add(watchDTO2);
		list.add(watchDTO3);
		list.add(watchDTO4);
		
		System.out.println("after sorting in ascending order....");
		Collections.sort(list, (p1,p2)->p1.getName().compareTo(p2.getName()));
		list.forEach(ref->System.out.println(ref));
		
		System.out.println("after sorting in decending order....");
		Collections.sort(list,(p1,p2)->p2.getName().compareTo(p1.getName()));
		list.forEach(ref1->System.out.println(ref1));


	}

}
