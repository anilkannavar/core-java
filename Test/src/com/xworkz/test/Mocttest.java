package com.xworkz.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mocttest {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("anil");
		list.add("kiran");
		list.add("madhu");
		list.add("nithin");
		list.add("hitesh");
		
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
	}
	
	

}
