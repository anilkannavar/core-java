package com.xworkz.test;

import java.util.ArrayList;
import java.util.List;

public class JoiningTwoList {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        list1.addAll(list2);
        System.out.println(list1);
    }
	}


