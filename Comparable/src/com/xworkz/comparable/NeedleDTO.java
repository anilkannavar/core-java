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
public class NeedleDTO implements Serializable,Comparable<NeedleDTO>{
	
	private int length;
	
	private int width;
	
	private String type;
	
	private String use;

	@Override
	public int compareTo(NeedleDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
