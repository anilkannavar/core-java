package com.xworkz.collections.rifill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collections.waterpurifier.WaterPurifier;
import com.xworkz.collections.waterpurifier.WaterPurifierComparator;

public class RefillRunner {
	
	public static void main(String[] args) {
		
		RefillDTO refillDTO=new RefillDTO("renolds", "plastic", 10, 210);
		RefillDTO refillDTO1=new RefillDTO("fusion", "plastic", 17, 970);
		RefillDTO refillDTO2=new RefillDTO("natarj", "metal", 14, 420);
		RefillDTO refillDTO3=new RefillDTO("hero", "fiber", 11, 820);
		RefillDTO refillDTO4=new RefillDTO("cell", "steel", 19, 1220);
		
		List<RefillDTO> list=new ArrayList<RefillDTO>();
		list.add(refillDTO);
		list.add(refillDTO1);
		list.add(refillDTO2);
		list.add(refillDTO3);
		list.add(refillDTO4);
		
		Comparator<RefillDTO> refillComparator=new RefillComparator();
		Collections.sort(list, refillComparator);
		for (RefillDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<RefillDTO> refillComparator1=new RefillNameComparatorDec();
		Collections.sort(list, refillComparator1);
		for (RefillDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<RefillDTO> refillComparator2=new RefillTypeComparatorAsc();
		Collections.sort(list, refillComparator2);
		for (RefillDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<RefillDTO> refillComparator3=new RefillTypeComparatorDec();
		Collections.sort(list, refillComparator3);
		for (RefillDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<RefillDTO> refillComparator4=new RefillCostComparatorAsc();
		Collections.sort(list, refillComparator4);
		for (RefillDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<RefillDTO> refillComparator5=new RefillCostComparatorDec();
		Collections.sort(list, refillComparator5);
		for (RefillDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<RefillDTO> refillComparator6=new RefillQuantityComparatorAsc();
		Collections.sort(list, refillComparator6);
		for (RefillDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<RefillDTO> refillComparator7=new RefillQuantityComparatorDec();
		Collections.sort(list, refillComparator7);
		for (RefillDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
	}

}
