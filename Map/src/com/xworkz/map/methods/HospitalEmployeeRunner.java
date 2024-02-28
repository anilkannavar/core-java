package com.xworkz.map.methods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HospitalEmployeeRunner {
	
	public static void main(String[] args) {
		
		Map<HospitalDTO, EmployeeDTO> map=new HashMap<HospitalDTO, EmployeeDTO>();
		
		HospitalDTO hospitalDTO=new HospitalDTO("ss", 200, "Davnagere", 2300);
		HospitalDTO hospitalDTO1=new HospitalDTO("cc", 110, "rnr", 5000);
		HospitalDTO hospitalDTO2=new HospitalDTO("jayadeva", 300, "shivamogga", 8000);
		
	    EmployeeDTO employeeDTO=new EmployeeDTO("manoj", 30000, 120, "durga");
	    EmployeeDTO employeeDTO1=new EmployeeDTO("kirthan", 60000, 810, "btm");
	    EmployeeDTO employeeDTO2=new EmployeeDTO("anil", 50000, 110, "silk board");
	    
	    map.put(hospitalDTO2, employeeDTO2);
	    map.put(hospitalDTO1, employeeDTO1);
	    map.put(hospitalDTO, employeeDTO);
	    
	    
		Map<HospitalDTO, EmployeeDTO> map1=new HashMap<HospitalDTO, EmployeeDTO>();
		
		HospitalDTO hospitalDTO3=new HospitalDTO("ss1", 2000, "Davnagere1", 23400);
		HospitalDTO hospitalDTO4=new HospitalDTO("cc2", 1100, "rnr2", 50000);
		HospitalDTO hospitalDTO5=new HospitalDTO("jayadeva3", 3000, "shivamogga3", 80001);
		
	    EmployeeDTO employeeDTO3=new EmployeeDTO("manoj2", 310000, 1120, "durga2");
	    EmployeeDTO employeeDTO4=new EmployeeDTO("kirthan4", 610000, 8110, "btm2");
	    EmployeeDTO employeeDTO5=new EmployeeDTO("anil5", 540000, 1110, "silk board2");
	    

	    
	    map1.put(hospitalDTO3, employeeDTO3);
	    map1.put(hospitalDTO4, employeeDTO4);
	    map1.put(hospitalDTO5, employeeDTO5);
	    
	    System.out.println("Keys are....");
		Set<HospitalDTO> refSet=map.keySet();
		refSet.forEach(k->System.out.println(k));
		
        System.out.println("======================");
		
		System.out.println("Values are...");
		Collection<EmployeeDTO> refCollection=map.values();
		refCollection.forEach(k->System.out.println(k));
		
        System.out.println("======================");

		System.out.println("Contains values are.......");
		System.out.println(map.containsValue(employeeDTO1));
		
		System.out.println("========================");

		System.out.println("Entry set are....");
        Set<Map.Entry<HospitalDTO, EmployeeDTO>> map12=map.entrySet();
        map12.forEach(h->System.out.println(h.getKey()+":"+h.getValue()));
        
		System.out.println("========================");
 
		System.out.println("Get values are....");
		System.out.println(map.get(hospitalDTO));
		
		System.out.println("========================");
 
		System.out.println("empty method values are....");
		System.out.println(map.isEmpty());
		
		System.out.println("========================");

		System.out.println("key set are.....");
        System.out.println(map.keySet());
        
		System.out.println("========================");
		System.out.println("put method are......");
		map.putAll(map1);
	     map.forEach((k,v)->System.out.println(k+":"+v));
		
        
        
		


	}

}
