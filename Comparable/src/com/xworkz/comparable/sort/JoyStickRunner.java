package com.xworkz.comparable.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.FireCrackerDTO;
import com.xworkz.comparable.JoyStickDTO;

public class JoyStickRunner {
	
	public static void main(String[] args) {
		
		JoyStickDTO joyStickDto=new JoyStickDTO("simple", 550, 15, "campnou");
		JoyStickDTO joyStickDto1=new JoyStickDTO("extra large", 100, 95, "dell");
		JoyStickDTO joyStickDto2=new JoyStickDTO("hard", 40, 270, "super");
		JoyStickDTO joyStickDto3=new JoyStickDTO("medium", 770, 43, "asus");
		JoyStickDTO joyStickDto4=new JoyStickDTO("flexed", 190, 35, "acer");

		List<JoyStickDTO> list=new ArrayList<>();
		list.add(joyStickDto);
		list.add(joyStickDto1);
		list.add(joyStickDto2);
		list.add(joyStickDto3);
		list.add(joyStickDto4);

		Collections.sort(list);
		for(JoyStickDTO ref:list) {
			System.out.println(ref);
		}
		
		Collections.sort(list,(o1,o2)->o2.getName().compareTo(o1.getName()));
		System.out.println("after sorting name in descending order");
		for(JoyStickDTO ref:list) {
			System.out.println(ref);
	}
	}
}
