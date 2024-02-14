package com.xworkz.reversestring;

import java.util.Iterator;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String str="Xworkz";
		String rev="";
		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)  //5 4 3 2 1 -1
		{
			rev=rev+str.charAt(i);  //z k r o w X
		}
		System.out.println("reverse string is:"+rev);
	}
}
