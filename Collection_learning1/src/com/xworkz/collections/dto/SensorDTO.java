package com.xworkz.collections.dto;

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

public class SensorDTO implements Serializable{
	
	private String name;
	
	private String type;
	
	private int cost;
	
	private double distance;

	

	
	}
	
	
	

