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
public class ThreadDTO implements Serializable,Comparable<ThreadDTO>{
	
	private int length;
	
	private String color;
	
	private int width;
	
	private String type;
	
	@Override
	public int compareTo(ThreadDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
