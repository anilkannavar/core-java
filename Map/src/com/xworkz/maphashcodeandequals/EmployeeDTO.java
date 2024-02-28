package com.xworkz.maphashcodeandequals;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class EmployeeDTO implements Serializable{
	
	String employeeName;
	
	String location;
	
	double width;

}
