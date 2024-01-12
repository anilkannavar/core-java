package com.xworkz.collections.sparkplug;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collections.rifill.RefillComparator;
import com.xworkz.collections.rifill.RefillDTO;

public class SparkPlugRunner {
	
	public static void main(String[] args) {
		
		SparkPlugDTO sparkPlugDTO=new SparkPlugDTO("honda", "gold", 150, 221);
		SparkPlugDTO sparkPlugDTO1=new SparkPlugDTO("bajaj", "metal", 900, 27);
		SparkPlugDTO sparkPlugDTO2=new SparkPlugDTO("pulsar", "steel", 190, 262);
		SparkPlugDTO sparkPlugDTO3=new SparkPlugDTO("suzuki", "plastic", 800, 82);
		SparkPlugDTO sparkPlugDTO4=new SparkPlugDTO("activa", "silver", 300, 20);
		
		List<SparkPlugDTO> list=new ArrayList<SparkPlugDTO>();
		list.add(sparkPlugDTO);
		list.add(sparkPlugDTO1);
		list.add(sparkPlugDTO2);
		list.add(sparkPlugDTO3);
		list.add(sparkPlugDTO4);
		
		Comparator<SparkPlugDTO> sparkplugComparator=new SparkPlugComparator();
		Collections.sort(list, sparkplugComparator);
		for (SparkPlugDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        		
        Comparator<SparkPlugDTO> sparkplugComparator1=new SparkPlugNameComparatorDec();
		Collections.sort(list, sparkplugComparator1);
		for (SparkPlugDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        		
        Comparator<SparkPlugDTO> sparkplugComparator2=new SparkPlugTypeComparatorAsc();
		Collections.sort(list, sparkplugComparator2);
		for (SparkPlugDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        		
        Comparator<SparkPlugDTO> sparkplugComparator3=new SparkPlugTypeComparatorDec();
		Collections.sort(list, sparkplugComparator3);
		for (SparkPlugDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        		
        Comparator<SparkPlugDTO> sparkplugComparator4=new SparkPlugCostComparatorAsc();
		Collections.sort(list, sparkplugComparator4);
		for (SparkPlugDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        		
        Comparator<SparkPlugDTO> sparkplugComparator5=new SparkPlugCostComparatorDec();
		Collections.sort(list, sparkplugComparator5);
		for (SparkPlugDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        		
        Comparator<SparkPlugDTO> sparkplugComparator6=new SparkPlugQuanityComparatorAsc();
		Collections.sort(list, sparkplugComparator6);
		for (SparkPlugDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        		
        Comparator<SparkPlugDTO> sparkplugComparator7=new SparkPlugQuantityComparatorDec();
		Collections.sort(list, sparkplugComparator7);
		for (SparkPlugDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        		

	}

}
