package com.xworkz.map.methods;

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

public class HospitalDTO implements Serializable{
	
	String name;
	
	int noOfDistance;
	
	String address;
	
	double cost;

}
