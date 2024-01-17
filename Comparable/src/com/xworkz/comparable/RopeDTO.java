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
public class RopeDTO implements Serializable,Comparable<RopeDTO>{
	
	private String name;
	
	private int cost;
	
	private double size;
	
	private int quantity;

	@Override
	public int compareTo(RopeDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
