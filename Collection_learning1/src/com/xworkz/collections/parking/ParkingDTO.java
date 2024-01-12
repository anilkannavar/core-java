package com.xworkz.collections.parking;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class ParkingDTO implements Serializable{
	
    private String brand;
	
	private int cost;
	
	private double quantity;
	
	private String country;


}
