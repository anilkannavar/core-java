package com.xworkz.comparable;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class WingsDTO implements Serializable,Comparable<WingsDTO>{
	
	private String name;
	
	private int cost;
	
	private double size;
	
	private String location;

	@Override
	public int compareTo(WingsDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
