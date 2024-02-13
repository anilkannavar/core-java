package com.xworkz.comparable.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.DiseaseDTO;

public class DiseaseRunner {
	
	public static void main(String[] args) {
		
		DiseaseDTO diseaseDTO=new DiseaseDTO("maleria", "fever", 200, 1000);
		DiseaseDTO diseaseDTO1=new DiseaseDTO("dengue", "cough", 340, 8000);
		DiseaseDTO diseaseDTO2=new DiseaseDTO("hiv", "lbc", 570, 4500);
		DiseaseDTO diseaseDTO3=new DiseaseDTO("cold", "tired", 100, 500);
		DiseaseDTO diseaseDTO4=new DiseaseDTO("migraine", "head ache", 700, 9800);
		
		List<DiseaseDTO> list=new ArrayList<DiseaseDTO>();
		list.add(diseaseDTO4);
		list.add(diseaseDTO2);
		list.add(diseaseDTO1);
		list.add(diseaseDTO3);
		list.add(diseaseDTO);
		
		System.out.println("after sorting in ascending order....");
		Collections.sort(list, (p1,p2)->p1.getSymptoms().compareTo(p2.getSymptoms()));
		list.forEach(ref->System.out.println(ref));
		
		System.out.println("after sorting in decending order....");
		Collections.sort(list, (p1,p2)->p2.getSymptoms().compareTo(p1.getSymptoms()));
		list.forEach(ref->System.out.println(ref));
	}
}
