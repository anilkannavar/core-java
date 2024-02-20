package com.xworkz.streams;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class MedicineDTO implements Serializable,Comparable<MedicineDTO>{
	
	private String name;
	
	private int id;
	
	private String company;
	
	private LocalDate expiryDate;
	
	private LocalDate manDate;
	
	private double cost;
	
	private String[] ingredients;

	@Override
	public int compareTo(MedicineDTO o) {
		return this.company.compareTo(o.getCompany());
	}

}
