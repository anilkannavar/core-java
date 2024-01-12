package com.xworkz.collections.paper;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@AllArgsConstructor
@ToString
public class PaperDTO implements Serializable{
	
	private String Name;
	
	private String type;
	
	private int cost;
	
	private double quantity;

}
