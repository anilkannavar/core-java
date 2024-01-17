package com.xworkz.comparable.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.CardBoardDTO;
import com.xworkz.comparable.ToyDTO;

public class ToyRunner {
	
	public static void main(String[] args) {
		
		ToyDTO toyDTO=new ToyDTO("teddy bear", 209, 785, "s");
		ToyDTO toyDTO2=new ToyDTO("train", 340, 908, "m");
		ToyDTO toyDTO3=new ToyDTO("car", 010, 325, "l");
		ToyDTO toyDTO4=new ToyDTO("dinosaur", 115, 309, "s");
		ToyDTO toyDTO5=new ToyDTO("giant wheel", 30, 2000, "xl");
		List<ToyDTO> list=new ArrayList<>();
		list.add(toyDTO);
		list.add(toyDTO2);
		list.add(toyDTO3);
		list.add(toyDTO4);
		list.add(toyDTO5);

		Collections.sort(list);
		for(ToyDTO ref:list) {
			System.out.println(ref);
	}
		Collections.sort(list,(o1,o2)->o2.getName().compareTo(o1.getName()));
		System.out.println("after sorting name in descending order");
		for(ToyDTO ref:list) {
			System.out.println(ref);


	}
	}
}
