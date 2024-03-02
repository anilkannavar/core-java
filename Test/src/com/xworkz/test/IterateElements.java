package com.xworkz.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateElements {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("salaar");
		list.add("kgf");
		list.add("rrr");
		list.add("kantaara");
		list.add("navagraha");
		
		System.out.println("original list is:"+list);
		for (String string : list) {
			System.out.println(string);
		}
	}
}
