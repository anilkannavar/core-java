package com.xworkz.collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.SortingFocusTraversalPolicy;

public class Tree {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(1000);
		list.add(500);
		list.add(2000);
		list.add(750);
		list.add(1200);
		list.add(300);
		list.add(1500);
		list.add(800);
		list.add(600);
		list.add(1100);
		
		Collections.sort(list);
		for (Integer integer1 : list) 
		{
			System.out.println("After Sorting as ascending order :"+integer1);
		}
		System.out.println("****************");
		
		Comparator<Integer> refComparator=new TreeImple();
		Collections.sort(list, refComparator);
		for (Integer treeInteger : list) 
		{
			System.out.println("After sorting as decsending order :"+treeInteger);
		}
		
	}

}
