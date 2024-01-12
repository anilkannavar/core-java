package com.xworkz.collections.belt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collections.charcoal.CharcoalComparator;
import com.xworkz.collections.charcoal.CharcoalDTO;

public class BeltRunner {
	
	public static void main(String[] args) {
		
		BeltDTO beltDTO=new BeltDTO("armani", "leather", 20000, 100);
		BeltDTO beltDTO1=new BeltDTO("balmain", "plastic", 2070, 100);
		BeltDTO beltDTO2=new BeltDTO("van heusam", "leather", 9000, 250);
		BeltDTO beltDTO3=new BeltDTO("peter england", "metal", 7900, 870);
		BeltDTO beltDTO4=new BeltDTO("luis phillippe", "poly", 10000, 910);
		
		List<BeltDTO> list=new ArrayList<BeltDTO>();
		list.add(beltDTO);
		list.add(beltDTO1);
		list.add(beltDTO2);
		list.add(beltDTO3);
		list.add(beltDTO4);
		
		Comparator<BeltDTO> beltComparator=new BeltComparator();
		Collections.sort(list, beltComparator);
		for (BeltDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        	
        Comparator<BeltDTO> beltComparator1=new BeltBrandComparatorDec();
		Collections.sort(list, beltComparator1);
		for (BeltDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        	
        Comparator<BeltDTO> beltComparator2=new BeltTypeComparatorAsc();
		Collections.sort(list, beltComparator2);
		for (BeltDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        	
        Comparator<BeltDTO> beltComparator3=new BeltTypeComparatorDec();
		Collections.sort(list, beltComparator3);
		for (BeltDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        	
        Comparator<BeltDTO> beltComparator4=new BeltCostComparatorAsc();
		Collections.sort(list, beltComparator4);
		for (BeltDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        	
        Comparator<BeltDTO> beltComparator5=new BeltCostComparatorDec();
		Collections.sort(list, beltComparator5);
		for (BeltDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        	
        Comparator<BeltDTO> beltComparator6=new BeltQuantityComparatorAsc();
		Collections.sort(list, beltComparator6);
		for (BeltDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        	
        Comparator<BeltDTO> beltComparator7=new BeltQuantityComparatorDec();
		Collections.sort(list, beltComparator7);
		for (BeltDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        	

	}

}
