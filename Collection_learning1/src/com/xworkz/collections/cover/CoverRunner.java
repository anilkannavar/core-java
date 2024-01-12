package com.xworkz.collections.cover;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collections.belt.BeltDTO;

public class CoverRunner {
	
	public static void main(String[] args) {
		
		CoverDTO coverDTO=new CoverDTO("people", 1210, 8100, "india");
		CoverDTO coverDTO1=new CoverDTO("geeric", 8990, 2100, "swiss");
		CoverDTO coverDTO2=new CoverDTO("varna", 103, 1900, "us");
		CoverDTO coverDTO3=new CoverDTO("zeneva", 810, 170, "brazil");
		CoverDTO coverDTO4=new CoverDTO("hala", 910, 200, "australia");
		
		List<CoverDTO> list=new ArrayList<CoverDTO>();
		list.add(coverDTO);
		list.add(coverDTO1);
		list.add(coverDTO2);
		list.add(coverDTO3);
		list.add(coverDTO4);
		
		Comparator<CoverDTO> coverComparator=new CoverComparator();
		Collections.sort(list, coverComparator);
		for (CoverDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        	
        Comparator<CoverDTO> coverComparator1=new CoverBrandComparatorDec();
		Collections.sort(list, coverComparator1);
		for (CoverDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<CoverDTO> coverComparator2=new CoverCostComparatorAsc();
		Collections.sort(list, coverComparator2);
		for (CoverDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<CoverDTO> coverComparator3=new CoverCostComparatorDec();
		Collections.sort(list, coverComparator3);
		for (CoverDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<CoverDTO> coverComparator4=new CoverQuantityComparatorAsc();
		Collections.sort(list, coverComparator4);
		for (CoverDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<CoverDTO> coverComparator5=new CoverQuantityComparatorDec();
		Collections.sort(list, coverComparator5);
		for (CoverDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<CoverDTO> coverComparator6=new CoverCountryComparatorAsc();
		Collections.sort(list, coverComparator6);
		for (CoverDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<CoverDTO> coverComparator7=new CoverCountryComparatorDec();
		Collections.sort(list, coverComparator7);
		for (CoverDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        	
	}

}
