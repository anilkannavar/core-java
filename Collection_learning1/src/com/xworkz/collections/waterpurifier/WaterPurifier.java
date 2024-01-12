package com.xworkz.collections.waterpurifier;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class WaterPurifier implements Serializable{
	
    private String name;
	
	private String type;  
	
	private int cost;
	
	private double quantity;

}
