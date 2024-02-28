package com.xworkz.map.bucket;

import java.io.Serializable;
import java.security.PublicKey;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonDTO implements Serializable{
	
	String name;
	
	String email;
	
	
	@Override
	public boolean equals(Object obj) {
		PersonDTO personDTO=null;
		if(obj!=null) {
			if(obj  instanceof PersonDTO) {
				PersonDTO personDTO1=new PersonDTO();
				if(this.email.equals(personDTO1.email)){
					return true;
				}
			}
		}
		return false;
	}

}
