package com.xworkz.collections.speaker;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class SpeakerDTO implements Serializable{
	
	private String name;
	
	private String type;
	
	private int cost;
	
	private double quantity;

}
