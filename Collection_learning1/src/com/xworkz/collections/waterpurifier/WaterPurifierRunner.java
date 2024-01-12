package com.xworkz.collections.waterpurifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collections.speaker.SpeakerComparator;
import com.xworkz.collections.speaker.SpeakerDTO;

public class WaterPurifierRunner {
	
	public static void main(String[] args) {
		
		WaterPurifier waterPurifier=new WaterPurifier("aquaguard", "Steel", 4400, 200);
		WaterPurifier waterPurifier1=new WaterPurifier("pureit", "plastic", 9400, 500);
		WaterPurifier waterPurifier2=new WaterPurifier("kent", "metal", 7800, 200);
		WaterPurifier waterPurifier3=new WaterPurifier("ro", "poly", 4100, 100);
		WaterPurifier waterPurifier4=new WaterPurifier("goodrej", "plastic", 8400, 800);
		
		List<WaterPurifier> list=new ArrayList<WaterPurifier>();
		list.add(waterPurifier);
		list.add(waterPurifier1);
		list.add(waterPurifier2);
		list.add(waterPurifier3);
		list.add(waterPurifier4);
		
		Comparator<WaterPurifier> waterpurifyComparator=new WaterPurifierComparator();
		Collections.sort(list, waterpurifyComparator);
		for (WaterPurifier paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        
        Comparator<WaterPurifier> waterpurifyComparator1=new WaterPurifierNameComparatorDec();
		Collections.sort(list, waterpurifyComparator1);
		for (WaterPurifier paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<WaterPurifier> waterpurifyComparator2=new WaterPurifierTypeComparatorAsc();
		Collections.sort(list, waterpurifyComparator2);
		for (WaterPurifier paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<WaterPurifier> waterpurifyComparator3=new WaterPurifierTypeComparatorDec();
		Collections.sort(list, waterpurifyComparator3);
		for (WaterPurifier paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<WaterPurifier> waterpurifyComparator4=new WaterPurifierCostComparatorAsc();
		Collections.sort(list, waterpurifyComparator4);
		for (WaterPurifier paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<WaterPurifier> waterpurifyComparator5=new WaterPurifierCostComparatorDec();
		Collections.sort(list, waterpurifyComparator5);
		for (WaterPurifier paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<WaterPurifier> waterpurifyComparator6=new WaterPurifierQuantityComparatorAsc();
		Collections.sort(list, waterpurifyComparator6);
		for (WaterPurifier paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<WaterPurifier> waterpurifyComparator7=new WaterPurifierQuantityComparatorDec();
		Collections.sort(list, waterpurifyComparator7);
		for (WaterPurifier paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
         
	}

}
