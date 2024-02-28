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

public class HotelDTO implements Serializable{
	
	String name;
	
	int code;
	
	String area;
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof HotelDTO) {
				HotelDTO hotelDTO=(HotelDTO)obj;
				if(this.area.equals(hotelDTO.getArea())) {
					return true;
				}
			}
		}
		return false;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getArea());
	}

	

}
