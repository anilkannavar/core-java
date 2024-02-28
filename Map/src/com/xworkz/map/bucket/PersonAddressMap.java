package com.xworkz.map.bucket;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PersonAddressMap {
	
	public static void main(String[] args) {
		
		Map<PersonDTO, AddressDTO> personaddressMap=new HashMap<PersonDTO, AddressDTO>();
	    
		PersonDTO personDTO=new PersonDTO("Madhu", "madhu@gmail.com");
		AddressDTO addressDTO=new AddressDTO(1, 56001, "MB kere");
		
		PersonDTO personDTO1=new PersonDTO("Faraz", "faraz@gmail.com");
		AddressDTO addressDTO1=new AddressDTO(123, 560012, "Vinobnagar");
		
		PersonDTO personDTO2=new PersonDTO("Mubarak", "madhu123@gmail.com");
		AddressDTO addressDTO2=new AddressDTO(231, 560214, "Vasth talkies");
		
		PersonDTO personDTO3=new PersonDTO("Kiran", "kiran@gmail.com");
		AddressDTO addressDTO3=new AddressDTO(170, 56101, "Davangere");
		
		PersonDTO personDTO4=new PersonDTO("Hitesh", "hitesh@gmail.com");
		AddressDTO addressDTO4=new AddressDTO(901, 570001, "Badravthi");
		
		personaddressMap.put(personDTO4, addressDTO4);
		personaddressMap.put(personDTO3, addressDTO3);
		personaddressMap.put(personDTO2, addressDTO2);
		personaddressMap.put(personDTO1, addressDTO1);
		personaddressMap.put(personDTO, addressDTO);
		
		
		
		








	}

}
