package com.xworkz.maphashcode.runner;

import java.util.HashMap;
import java.util.Map;

import com.xworkz.maphashcodeandequals.GarageDTO;
import com.xworkz.maphashcodeandequals.MechanicDTO;

public class MechanicGarageRunner {
	
	public static void main(String[] args) {
		
		Map<MechanicDTO, GarageDTO> map=new HashMap<MechanicDTO, GarageDTO>();
		
		MechanicDTO mechanicDTO=new MechanicDTO("Anil", "Davangere", 1234);
		GarageDTO garageDTO=new GarageDTO("ks garage", 546, 300.6);
		
		MechanicDTO mechanicDTO1=new MechanicDTO("madhu", "chitradurga", 9904);
		GarageDTO garageDTO1=new GarageDTO("aone", 796, 378.6);
		
		MechanicDTO mechanicDTO2=new MechanicDTO("kiran", "hmg", 123);
		GarageDTO garageDTO2=new GarageDTO("quality", 546, 300.6);
		
		MechanicDTO mechanicDTO3=new MechanicDTO("manoj", "malebennur", 786);
		GarageDTO garageDTO3=new GarageDTO("new", 436,400.6);
		
		MechanicDTO mechanicDTO4=new MechanicDTO("hitesh", "badravathi", 910);
		GarageDTO garageDTO4=new GarageDTO("highend", 111, 678.1);
		
		MechanicDTO mechanicDTO5=new MechanicDTO("harshith", "shivamogga", 999);
		GarageDTO garageDTO5=new GarageDTO("old", 145, 786);
		
		MechanicDTO mechanicDTO6=new MechanicDTO("john", "chennai", 9807);
		GarageDTO garageDTO6=new GarageDTO("madras", 876, 567.3);
		
		MechanicDTO mechanicDTO7=new MechanicDTO("jagadish", "raichur", 8970);
		GarageDTO garageDTO7=new GarageDTO("vintage", 198, 167.0);
		
		MechanicDTO mechanicDTO8=new MechanicDTO("mithun", "vasanths talkies", 666);
		GarageDTO garageDTO8=new GarageDTO("steven", 480, 450.6);
		
		MechanicDTO mechanicDTO9=new MechanicDTO("koushik", "hadadi", 900);
		GarageDTO garageDTO9=new GarageDTO("nuthan", 216, 398.6);
		
		map.put(mechanicDTO9, garageDTO9);
		map.put(mechanicDTO8, garageDTO8);
		map.put(mechanicDTO7, garageDTO7);
		map.put(mechanicDTO6, garageDTO6);
		map.put(mechanicDTO5, garageDTO5);
		map.put(mechanicDTO4, garageDTO4);
		map.put(mechanicDTO3, garageDTO3);
		map.put(mechanicDTO2, garageDTO2);
		map.put(mechanicDTO1, garageDTO1);
		map.put(mechanicDTO, garageDTO);
		
		MechanicDTO mechanicDTO10=new MechanicDTO("karan", "hadadi", 800);
		GarageDTO garageDTO10=new GarageDTO("generation", 216, 398.6);
		

		
		System.out.println("exists :"+map.containsKey(mechanicDTO10));
		
		map.put(mechanicDTO10, garageDTO10);


		
		map.forEach((k,v)->System.out.println(k +" : "+ v));
		
	}

}
