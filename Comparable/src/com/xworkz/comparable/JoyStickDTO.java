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
public class JoyStickDTO implements Serializable,Comparable<JoyStickDTO>{
	
	private String name;
	
	private double cost;
	
	private int quantity;
	
	private String company;

	@Override
	public int compareTo(JoyStickDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
