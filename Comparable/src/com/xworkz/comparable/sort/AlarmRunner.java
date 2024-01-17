package com.xworkz.comparable.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.AlarmDTO;

public class AlarmRunner {
	
	public static void main(String[] args) {
		
		AlarmDTO alaramDto=new AlarmDTO("tabla", 3, 344,"mobile");
		AlarmDTO alaramDto1=new AlarmDTO("piano", 4, 289,"home");
		AlarmDTO alaramDto2=new AlarmDTO("guitar", 2, 877,"office");
		AlarmDTO alaramDto3=new AlarmDTO("flute", 9, 101,"shop");
		AlarmDTO alaramDto4=new AlarmDTO("song", 6, 302,"house");

		List<AlarmDTO> list=new ArrayList<>();
		list.add(alaramDto);
		list.add(alaramDto1);
		list.add(alaramDto2);
		list.add(alaramDto3);
		list.add(alaramDto4);

		Collections.sort(list);
		System.out.println("after sorting tune in ascending order");
		for(AlarmDTO ref:list) {
			System.out.println(ref);
		}

		Collections.sort(list,(o1,o2)->o2.getCompany().compareTo(o1.getCompany()));
		System.out.println("after sorting compnay in descending order");
		for(AlarmDTO ref:list) {
			System.out.println(ref);
	}

	}
}
