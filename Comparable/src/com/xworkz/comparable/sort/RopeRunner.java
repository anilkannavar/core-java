package com.xworkz.comparable.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.RopeDTO;
import com.xworkz.comparable.WingsDTO;

public class RopeRunner {
	
	public static void main(String[] args) {
		
		RopeDTO ropeDto=new RopeDTO("thread",10,2.5,90);
		RopeDTO ropeDto1=new RopeDTO("cloth",15, 70.0d, 6 );
		RopeDTO ropeDto2=new RopeDTO("plastic",25, 5.00d, 2 );
		RopeDTO ropeDto3=new RopeDTO("poyster",30,30.0, 1);
		RopeDTO ropeDto4=new RopeDTO("thread",10, 10.7, 9 );

		List<RopeDTO> list=new ArrayList<>();
		list.add(ropeDto);	
		list.add(ropeDto1);	
		list.add(ropeDto2);	
		list.add(ropeDto3);	
		list.add(ropeDto4);

		Collections.sort(list);;

		for(RopeDTO ref:list) {
			System.out.println(ref);
		}
		Collections.sort(list,(o1,o2)->o2.getName().compareTo(o1.getName()));
		System.out.println("after sorting name in descending order");
		for(RopeDTO ref:list) {
			System.out.println(ref);


		}
	}

}
