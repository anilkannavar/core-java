package com.xworkz.collections.charcoal;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class CharcoalDTO  implements Serializable{

    private String name;
	
	private String location;  
	
	private int cost;
	
	private double quantity; 

}
