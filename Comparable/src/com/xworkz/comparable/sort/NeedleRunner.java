package com.xworkz.comparable.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.NeedleDTO;
import com.xworkz.comparable.ThreadDTO;

public class NeedleRunner {
	
	public static void main(String[] args) {
		
		NeedleDTO needleDto=new NeedleDTO(360, 209, "Sewing", "stitching");
		NeedleDTO needleDto1=new NeedleDTO(520, 105, "sharp", "cutting");
		NeedleDTO needleDto2=new NeedleDTO(570, 275, "sharp", "piecing");
		NeedleDTO needleDto3=new NeedleDTO(100, 575, "sewingtype", "stitching");
		NeedleDTO needleDto4=new NeedleDTO(598, 210, "murder", "kill");

		List<NeedleDTO> list=new ArrayList<>();
		list.add(needleDto);
		list.add(needleDto1);
		list.add(needleDto2);
		list.add(needleDto3);
		list.add(needleDto4);

		Collections.sort(list);
		for(NeedleDTO ref:list) {
			System.out.println(ref);
		}
		
		Collections.sort(list,(o1,o2)->o2.getUse().compareTo(o1.getUse()));
		System.out.println("after sorting use in descending order");
		for(NeedleDTO ref:list) {
			System.out.println(ref);

	}

	}

}
