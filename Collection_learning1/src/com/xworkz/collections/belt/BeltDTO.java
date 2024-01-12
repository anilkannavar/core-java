package com.xworkz.collections.belt;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class BeltDTO implements Serializable{
	
    private String brand;
	
	private String type;  
	
	private int cost;
	
	private double quantity; 


}
