package com.xworkz.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlphabeticalOrder {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("Banglore");
		list.add("btm");
		list.add("rajajinagar");
		list.add("silk board");
		list.add("gandhi nagar");
		
		
        Collections.sort(list, (p1,p2)->p1.compareTo(p2));
		System.out.println("elemets after making it as alphabetical order"+list);

	}

}
