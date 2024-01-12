package com.xworkz.collections.charcoal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collections.sparkplug.SparkPlugDTO;

public class CharcoalRunner {
	
	public static void main(String[] args) {
		
		CharcoalDTO charcoalDTO=new CharcoalDTO("black", "banglore", 1000, 3);
		CharcoalDTO charcoalDTO1=new CharcoalDTO("brown", "mysore", 5700, 23);
		CharcoalDTO charcoalDTO2=new CharcoalDTO("white", "tumkur", 4500, 13);
		CharcoalDTO charcoalDTO3=new CharcoalDTO("red", "davangere", 7800, 10);
		CharcoalDTO charcoalDTO4=new CharcoalDTO("green", "chitradurga", 8800, 8);
		
		List<CharcoalDTO> list=new ArrayList<CharcoalDTO>();
		list.add(charcoalDTO);
		list.add(charcoalDTO1);
		list.add(charcoalDTO2);
		list.add(charcoalDTO3);
		list.add(charcoalDTO4);
		
		Comparator<CharcoalDTO> charcoalComparator=new CharcoalComparator();
		Collections.sort(list, charcoalComparator);
		for (CharcoalDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        	
        Comparator<CharcoalDTO> charcoalComparator1=new CharcoalNameComparatorDec();
		Collections.sort(list, charcoalComparator1);
		for (CharcoalDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        	
        Comparator<CharcoalDTO> charcoalComparator2=new CharcoalLocationComparatorAsc();
		Collections.sort(list, charcoalComparator2);
		for (CharcoalDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<CharcoalDTO> charcoalComparator3=new CharcoalLocationComparatorDec();
		Collections.sort(list, charcoalComparator3);
		for (CharcoalDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<CharcoalDTO> charcoalComparator4=new CharcoalCostComparatorAsc();
		Collections.sort(list, charcoalComparator4);
		for (CharcoalDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<CharcoalDTO> charcoalComparator5=new CharcoalCostComparatorDec();
		Collections.sort(list, charcoalComparator5);
		for (CharcoalDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        	
        Comparator<CharcoalDTO> charcoalComparator6=new CharcoalQuantityComparatorAsc();
		Collections.sort(list, charcoalComparator6);
		for (CharcoalDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<CharcoalDTO> charcoalComparator7=new CharcoalQuantityComparatorDec();
		Collections.sort(list, charcoalComparator7);
		for (CharcoalDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        	
	}

}
