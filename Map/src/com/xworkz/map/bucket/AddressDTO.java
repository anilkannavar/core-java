package com.xworkz.map.bucket;

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
public class AddressDTO implements Serializable{

	int no;
	int pincode;
	String street;
	
	

}
