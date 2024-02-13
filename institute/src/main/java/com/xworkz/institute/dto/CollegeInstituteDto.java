package com.xworkz.institute.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CollegeInstituteDto {
	
	private int id;
	
	private String name;
	
	private String address;
	
	private int code;
	
	private String location;

}
