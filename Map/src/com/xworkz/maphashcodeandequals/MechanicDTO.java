package com.xworkz.maphashcodeandequals;

import java.io.Serializable;
import java.util.Objects;

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

public class MechanicDTO implements Serializable{
	
	String name;
	
	String address;
	
	int no;
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof MechanicDTO) {
				MechanicDTO ref=(MechanicDTO)obj;
				if(this.address.equals(ref.getAddress())) {
					return true;
				}
			}
		}
		return false;
		
	}
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(getAddress());
	}

	

}
