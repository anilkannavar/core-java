package com.xworkz.map.methods;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class EmployeeDTO implements Serializable{
 
	String name;
	
	double salary;
	
	int id;
	
	String location;
}
