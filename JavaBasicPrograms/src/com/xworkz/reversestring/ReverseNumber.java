package com.xworkz.reversestring;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num=scanner.nextInt(); //1234
		
		int rev=0;
		
		while(num!=0) {
			rev=rev*10 + num%10;   // 0*10 + 1234%10   40+3=43  430+2=432  432*10=4320+1=4321
			num=num/10;            // 1234/10=123   123/10=12   12/10=1    1/10=0
		}
		System.out.println("the reverse number is:"+rev);
	}

}
