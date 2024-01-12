package com.xworkz.collections.parking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collections.cover.CoverComparator;
import com.xworkz.collections.cover.CoverDTO;

public class ParkingRunner {
	
	public static void main(String[] args) {
		
		ParkingDTO parkingDTO=new ParkingDTO("denim", 1230, 2890, "south africa");
		ParkingDTO parkingDTO1=new ParkingDTO("lv", 7230, 1890, "washington");
		ParkingDTO parkingDTO2=new ParkingDTO("pe", 1230, 8890, "denmark");
		ParkingDTO parkingDTO3=new ParkingDTO("lp", 6230, 5890, "geneva");
		ParkingDTO parkingDTO4=new ParkingDTO("zara", 9230, 890, "armania");
		
		List<ParkingDTO> list=new ArrayList<ParkingDTO>();
		list.add(parkingDTO);
		list.add(parkingDTO1);
		list.add(parkingDTO2);
		list.add(parkingDTO3);
		list.add(parkingDTO4);
		
		Comparator<ParkingDTO> parkingComparator=new ParkingComparator();
		Collections.sort(list, parkingComparator);
		for (ParkingDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<ParkingDTO> parkingComparator1=new ParkingBrandComparatorDec();
		Collections.sort(list, parkingComparator1);
		for (ParkingDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<ParkingDTO> parkingComparator2=new ParkingCostComparatorAsc();
		Collections.sort(list, parkingComparator2);
		for (ParkingDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<ParkingDTO> parkingComparator3=new ParkingCostComparatorDec();
		Collections.sort(list, parkingComparator3);
		for (ParkingDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<ParkingDTO> parkingComparator4=new ParkingQuantityComparatorAsc();
		Collections.sort(list, parkingComparator4);
		for (ParkingDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<ParkingDTO> parkingComparator5=new ParkingQuantityComparatorDec();
		Collections.sort(list, parkingComparator5);
		for (ParkingDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        
        Comparator<ParkingDTO> parkingComparator6=new ParkingCountryComparatorAsc();
		Collections.sort(list, parkingComparator6);
		for (ParkingDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
        Comparator<ParkingDTO> parkingComparator7=new ParkingCountryComparatorDec();
		Collections.sort(list, parkingComparator7);
		for (ParkingDTO paper1 : list) {
			System.out.println(paper1);
		}
        System.out.println("*********************************");
        
	}

}
