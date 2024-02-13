package com.xworkz.comparable;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PlaygroundDTO implements Serializable,Comparable<PlaygroundDTO>{
	
	private String name;
	
	private String location;
	
	private double width;
	
	private double areaInKms;

	@Override
	public int compareTo(PlaygroundDTO o) {
		return Double.compare(this.areaInKms, o.getAreaInKms());
	}

}
