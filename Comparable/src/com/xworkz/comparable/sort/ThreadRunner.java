package com.xworkz.comparable.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.RopeDTO;
import com.xworkz.comparable.ThreadDTO;

public class ThreadRunner {
	
	public static void main(String[] args) {
		
		ThreadDTO threadDto=new ThreadDTO(20, "red", 5, "thread");
		ThreadDTO threadDto1=new ThreadDTO(135, "black", 676, "cloth");
		ThreadDTO threadDto2=new ThreadDTO(25, "yellow green", 2, "plastic");
		ThreadDTO threadDto3=new ThreadDTO(370, "blue", 16, "poyster");
		ThreadDTO threadDto4=new ThreadDTO(108, "maroon", 9, "thread");

		List<ThreadDTO> list=new ArrayList<>();
		list.add(threadDto);	
		list.add(threadDto1);	
		list.add(threadDto2);	
		list.add(threadDto3);	
		list.add(threadDto4);

		Collections.sort(list);

		for(ThreadDTO ref:list) {
			System.out.println(ref);
		}
		Collections.sort(list,(o1,o2)->o2.getType().compareTo(o1.getType()));
		System.out.println("after sorting type in descending order");
		for(ThreadDTO ref:list) {
			System.out.println(ref);

	}

}
}
