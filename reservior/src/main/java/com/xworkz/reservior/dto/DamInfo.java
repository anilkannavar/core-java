package com.xworkz.reservior.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DamInfo {
	
	private int id;
		
	private String place;
	
	private String state;
	
	private int height;

}
