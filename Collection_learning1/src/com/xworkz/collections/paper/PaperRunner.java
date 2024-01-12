package com.xworkz.collections.paper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collections.dto.SensorDTO;

public class PaperRunner {
	
	public static void main(String[] args) {
		
		PaperDTO paperDTO=new PaperDTO("vijayavani", "kannada", 10, 20);
		PaperDTO paperDTO1=new PaperDTO("prajavani", "kannada", 8, 10);
		PaperDTO paperDTO2=new PaperDTO("decan herald", "hindi", 13, 60);
		PaperDTO paperDTO3=new PaperDTO("prajavani", "mararhi", 20, 30);
		PaperDTO paperDTO4=new PaperDTO("bbc", "bengali", 10, 20);

		
		List<PaperDTO> list=new ArrayList<PaperDTO>();
		list.add(paperDTO);
		list.add(paperDTO1);
		list.add(paperDTO2);
		list.add(paperDTO4);
		list.add(paperDTO4);
		
		Comparator<PaperDTO> comparator=new PaperComparator();
		Collections.sort(list, comparator);
		for (PaperDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<PaperDTO> comparator1=new PaperNameComparatorDec();
		Collections.sort(list, comparator1);
		for (PaperDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<PaperDTO> comparator2=new PaperTypeComparatorAsc();
		Collections.sort(list, comparator2);
		for (PaperDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<PaperDTO> comparator3=new PaperTypeComparatorDec();
		Collections.sort(list, comparator3);
		for (PaperDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<PaperDTO> comparator4=new PaperCostComparatorAsc();
		Collections.sort(list, comparator4);
		for (PaperDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<PaperDTO> comparator5=new PaperCostComparatorDec();
		Collections.sort(list, comparator5);
		for (PaperDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<PaperDTO> comparator6=new PaperQuantityComparatorAsc();
		Collections.sort(list, comparator6);
		for (PaperDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<PaperDTO> comparator7=new PaperQunaityComparatorDec();
		Collections.sort(list, comparator7);
		for (PaperDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        
	}

}
