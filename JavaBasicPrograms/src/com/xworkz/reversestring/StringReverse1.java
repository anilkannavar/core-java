package com.xworkz.reversestring;

import java.util.Iterator;

public class StringReverse1 {
	
	public static void main(String[] args) {
		
		String str="Xworkz";
		String rev="";
		
		char a[]=str.toCharArray();
		int len=a.length; //6
		
		for(int i=len-1;i>=0;i--)  //5 4 3 2 1 0
		{
			rev=rev+a[i]; //z k r o w X
		}
		System.out.println("reverse string is:"+rev);
	}
}
