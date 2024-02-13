package com.xworkz.comparable;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DiseaseDTO implements Serializable,Comparable<DiseaseDTO>{
	
	private String name;
	
	private String symptoms;
	
	private double capacity;
	
	private int treatmentCost;

	@Override
	public int compareTo(DiseaseDTO o) {
		return this.symptoms.compareTo(o.getSymptoms());
	}

}
