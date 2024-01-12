package com.xworkz.collections.speaker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collections.paper.PaperComparator;
import com.xworkz.collections.paper.PaperDTO;

public class SpeakerRunner {
	
	public static void main(String[] args) {
		
		SpeakerDTO speakerDTO=new SpeakerDTO("Boat", "plastic", 2000, 30);
		SpeakerDTO speakerDTO1=new SpeakerDTO("noice", "steel", 8000, 10);
		SpeakerDTO speakerDTO2=new SpeakerDTO("jbl", "poly", 3100, 10);
		SpeakerDTO speakerDTO3=new SpeakerDTO("bolt", "fiber", 4000, 40);
		SpeakerDTO speakerDTO4=new SpeakerDTO("Bost", "matty", 2080, 20);
		
		List<SpeakerDTO> list=new ArrayList<SpeakerDTO>();
		list.add(speakerDTO);
		list.add(speakerDTO1);
		list.add(speakerDTO2);
		list.add(speakerDTO3);
		list.add(speakerDTO4);
		
		Comparator<SpeakerDTO> speaComparator=new SpeakerComparator();
		Collections.sort(list, speaComparator);
		for (SpeakerDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<SpeakerDTO> speaComparator1=new SpeakerNameComparatoDec();
		Collections.sort(list, speaComparator1);
		for (SpeakerDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<SpeakerDTO> speaComparator2=new SpeakerTypeComparatoAsc();
		Collections.sort(list, speaComparator2);
		for (SpeakerDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<SpeakerDTO> speaComparator3=new SpeakerTypeComparatoDec();
		Collections.sort(list, speaComparator3);
		for (SpeakerDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<SpeakerDTO> speaComparator4=new SpeakerCostComparatoAsc();
		Collections.sort(list, speaComparator4);
		for (SpeakerDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<SpeakerDTO> speaComparator5=new SpeakerCostComparatoDec();
		Collections.sort(list, speaComparator5);
		for (SpeakerDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<SpeakerDTO> speaComparator6=new SpeakerQuantityComparatoAsc();
		Collections.sort(list, speaComparator6);
		for (SpeakerDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<SpeakerDTO> speaComparator7=new SpeakerQuantityComparatoDec();
		Collections.sort(list, speaComparator7);
		for (SpeakerDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        
	}

}
