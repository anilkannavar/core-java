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

public class CollegeDTO implements Serializable{
	
	String name;
	
	int collegeId;
	
	String university;

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof CollegeDTO) {
				CollegeDTO collegeDTO=(CollegeDTO) obj;
				if(this.name.equals(collegeDTO.getName())) {
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
