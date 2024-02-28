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

public class Capital implements Serializable{
	
	String name;
	
	String president;
	
	double size;

}
