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

public class CountryDTO implements Serializable{
	
	String name;
	
	double areaInKms;
	
	int founded;

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof CountryDTO) {
				CountryDTO countryDTO=(CountryDTO) obj;
				if(this.name.equals(countryDTO.getName())) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getName());
	}

	
	
	

}
