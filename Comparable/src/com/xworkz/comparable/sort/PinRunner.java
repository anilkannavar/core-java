package com.xworkz.comparable.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.NeedleDTO;
import com.xworkz.comparable.PinDTO;

public class PinRunner {
	
	public static void main(String[] args) {
		
		PinDTO needleDto=new PinDTO(30, 620, "pin1", "stitching");
		PinDTO needleDto1=new PinDTO(820, 15, "pin2", "cutting");
		PinDTO needleDto2=new PinDTO(50, 1325, "pin8", "piecing");
		PinDTO needleDto3=new PinDTO(710, 5, "pin5", "stitching");
		PinDTO needleDto4=new PinDTO(65, 2, "pin3", "kill");

		List<PinDTO> list=new ArrayList<>();
		list.add(needleDto);
		list.add(needleDto1);
		list.add(needleDto2);
		list.add(needleDto3);
		list.add(needleDto4);

		Collections.sort(list);
		for(PinDTO ref:list) {
			System.out.println(ref);
		}
		
		Collections.sort(list,(o1,o2)->o2.getType().compareTo(o1.getType()));
		System.out.println("after sorting type in descending order");
		for(PinDTO ref:list) {
			System.out.println(ref);
	}
	}
}
