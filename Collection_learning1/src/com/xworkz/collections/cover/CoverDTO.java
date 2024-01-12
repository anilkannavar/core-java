package com.xworkz.collections.cover;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class CoverDTO implements Serializable{
	
	private String brand;
	
	private int cost;
	
	private double quantity;
	
	private String country;

}
