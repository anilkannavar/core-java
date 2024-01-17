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
public class ToyDTO implements Serializable,Comparable<ToyDTO>{
	
	private String name;
	
	private int cost;
	
	private double quantity;
	
	private String size;

	@Override
	public int compareTo(ToyDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
