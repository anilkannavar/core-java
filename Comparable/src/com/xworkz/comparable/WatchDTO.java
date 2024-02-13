package com.xworkz.comparable;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WatchDTO implements Serializable,Comparable<WatchDTO>{
	
	private String name;
	
	private String country;
	
	private double cost;
	
	private double weight;

	@Override
	public int compareTo(WatchDTO o) {
		return this.name.compareTo(o.getName());
	}

}
