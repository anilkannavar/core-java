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
public class PinDTO implements Serializable,Comparable<PinDTO>{
	
	private int length;
	
	private int width;
	
	private String type;
	
	private String use;

	@Override
	public int compareTo(PinDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
