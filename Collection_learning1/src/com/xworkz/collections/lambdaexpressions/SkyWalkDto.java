package com.xworkz.collections.lambdaexpressions;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@AllArgsConstructor
@ToString
public class SkyWalkDto implements Serializable{
	
	private String name;
	
	private String location;
	
	private int manufacturedCost;

	private int steps;
}
