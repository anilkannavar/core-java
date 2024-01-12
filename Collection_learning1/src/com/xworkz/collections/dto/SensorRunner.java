package com.xworkz.collections.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collections.sort.SensorCostComparatorAsc;
import com.xworkz.collections.sort.SensorCostComparatorDec;
import com.xworkz.collections.sort.SensorDistanceComparatorAsc;
import com.xworkz.collections.sort.SensorDistanceComparatorDec;
import com.xworkz.collections.sort.SensorNameComparatorAsc;
import com.xworkz.collections.sort.SensorNameComparatorDec;
import com.xworkz.collections.sort.SensorTypeComparatorAsc;
import com.xworkz.collections.sort.SensorTypeComparatorDec;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class SensorRunner {
	
	public static void main(String[] args) {
		
		SensorDTO sensorDTO=new SensorDTO("ultrasonic sensor", "distance detect", 20, 300);
		SensorDTO sensorDTO2=new SensorDTO("sound sensor","detects sound",30,400);
		SensorDTO sensorDTO3=new SensorDTO("ldr sensor","detects light",50,800);
		SensorDTO sensorDTO4=new SensorDTO("noise sensor","detects noise",10,800);
		SensorDTO sensorDTO5=new SensorDTO("fire dtect sensor","detect fire",200,700);
		
		List<SensorDTO> list=new ArrayList<SensorDTO>();
		list.add(sensorDTO);
		list.add(sensorDTO2);
		list.add(sensorDTO3);
		list.add(sensorDTO4);
		list.add(sensorDTO5);
		
		Comparator<SensorDTO> comparator=new SensorNameComparatorAsc();
		Collections.sort(list, comparator);
		for (SensorDTO ref : list) 
		{
			System.out.println(ref);
		}
		System.out.println("************************************");
		
		Comparator<SensorDTO> comparator1=new SensorNameComparatorDec();
		Collections.sort(list, comparator1);
		for (SensorDTO ref : list) 
		{
			System.out.println(ref);
		}
		System.out.println("************************************");
		
		Comparator<SensorDTO> comparator2=new SensorTypeComparatorAsc();
		Collections.sort(list, comparator2);
		for (SensorDTO ref : list) 
		{
			System.out.println(ref);
		}
		System.out.println("************************************");
		
		Comparator<SensorDTO> comparator3=new SensorTypeComparatorDec();
		Collections.sort(list, comparator3);
		for (SensorDTO ref : list) 
		{
			System.out.println(ref);
		}
		System.out.println("************************************");
		
		Comparator<SensorDTO> comparator4=new SensorCostComparatorAsc();
		Collections.sort(list, comparator4);
		for (SensorDTO ref : list) 
		{
			System.out.println(ref);
		}
		System.out.println("************************************");
		
		Comparator<SensorDTO> comparator5=new SensorCostComparatorDec();
		Collections.sort(list, comparator5);
		for (SensorDTO ref : list) 
		{
			System.out.println(ref);
		}
		System.out.println("************************************");
		
		Comparator<SensorDTO> comparator6=new SensorDistanceComparatorAsc();
		Collections.sort(list, comparator6);
		for (SensorDTO ref : list) 
		{
			System.out.println(ref);
		}
		System.out.println("************************************");
		
		Comparator<SensorDTO> comparator7=new SensorDistanceComparatorDec();
		Collections.sort(list, comparator7);
		for (SensorDTO ref : list) 
		{
			System.out.println(ref);
		}
		System.out.println("************************************");
		
		
		
		
	}

}
