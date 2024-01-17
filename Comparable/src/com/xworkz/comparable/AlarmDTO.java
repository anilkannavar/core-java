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
public class AlarmDTO implements Serializable,Comparable<AlarmDTO>{
	private String name;
	
	private int cost;
	
	private double size;
	
	private String company;

	@Override
	public int compareTo(AlarmDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
