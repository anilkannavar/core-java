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
public class TelescopeDto implements Serializable{
	
	private String name;
	
	private int cost;
	
	private double weight;
	
	private String country;

}
