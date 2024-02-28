package com.xworkz.maphashcode.runner;

import java.util.HashMap;
import java.util.Map;

import com.xworkz.maphashcodeandequals.EmployeeDTO;
import com.xworkz.maphashcodeandequals.HotelDTO;

public class HotelEmployeeRunner {
	
	public static void main(String[] args) {
		
		Map<HotelDTO, EmployeeDTO> map=new HashMap<HotelDTO, EmployeeDTO>();
		
		HotelDTO hotelDTO=new HotelDTO("Steven", 45012, "BTM layout");
		EmployeeDTO employeeDTO=new EmployeeDTO("Kiran", "Banglore", 270);
		
		HotelDTO hotelDTO1 = new HotelDTO("Sheraton", 12345, "Downtown");
		EmployeeDTO employeeDTO1 = new EmployeeDTO("Sara", "New York", 350);
		
		HotelDTO hotelDTO2 = new HotelDTO("Hilton", 54321, "City Center");
		EmployeeDTO employeeDTO2 = new EmployeeDTO("Mike", "Los Angeles", 275);
		
		HotelDTO hotelDTO3 = new HotelDTO("Marriott", 98765, "Waterfront");
		EmployeeDTO employeeDTO3 = new EmployeeDTO("Emily", "Chicago", 300);

		HotelDTO hotelDTO4 = new HotelDTO("Holiday Inn", 24680, "Airport");
		EmployeeDTO employeeDTO4 = new EmployeeDTO("David", "San Francisco", 400);

		HotelDTO hotelDTO5 = new HotelDTO("Radisson", 13579, "Business District");
		EmployeeDTO employeeDTO5 = new EmployeeDTO("Emma", "Seattle", 320);

		HotelDTO hotelDTO6 = new HotelDTO("Hyatt", 87654, "taj");
		EmployeeDTO employeeDTO6 = new EmployeeDTO("Olivia", "New York", 320);

		
		HotelDTO hotelDTO7 = new HotelDTO("Four Seasons", 99999, "City mall");
		EmployeeDTO employeeDTO7 = new EmployeeDTO("Ethan", "Los Angeles", 280);


		HotelDTO hotelDTO8 = new HotelDTO("Westin", 24680, "Waterfront");
		EmployeeDTO employeeDTO8 = new EmployeeDTO("William", "San Francisco", 380);


		HotelDTO hotelDTO9 = new HotelDTO("taj", 12345, "Business District");
		EmployeeDTO employeeDTO9 = new EmployeeDTO("anil", "dvg", 390);
		
		
        map.put(hotelDTO9, employeeDTO9);
        map.put(hotelDTO8, employeeDTO8);
        map.put(hotelDTO7, employeeDTO7);
        map.put(hotelDTO6, employeeDTO6);
        map.put(hotelDTO5, employeeDTO5);
        map.put(hotelDTO4, employeeDTO4);
        map.put(hotelDTO3, employeeDTO3);
        map.put(hotelDTO2, employeeDTO2);
        map.put(hotelDTO1, employeeDTO1);
        map.put(hotelDTO, employeeDTO);


		HotelDTO hotelDTO10 = new HotelDTO("InterContinental", 13579, "Business District");
		EmployeeDTO employeeDTO10 = new EmployeeDTO("Mia", "Seattle", 270);
		
		map.put(hotelDTO10, employeeDTO10);
		
		System.out.println("exists :"+map.containsKey(hotelDTO10));
		
		map.forEach((k,v)->System.out.println(k+ ":"+v));

		
		

	}

}
