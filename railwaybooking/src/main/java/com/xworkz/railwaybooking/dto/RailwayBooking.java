package com.xworkz.railwaybooking.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class RailwayBooking {
	
	private int id;
	
	private String train_name;
	
	private String source;
	
	private String destination;
	
	private int price;

}
