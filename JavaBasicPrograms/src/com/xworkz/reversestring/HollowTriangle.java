package com.xworkz.reversestring;

public class HollowTriangle {
	
	public static void main(String[] args) {
		
		int rows=7;
		int cols=8;
		
		//outer loop for rows
		for(int i=1;i<=rows;i++) {
			
			//inner loop for column
			for(int j=1;j<=cols;j++) {
				
			
			if(i==1 || j==1 || i==rows || j==cols) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
			System.out.println();

	}
	}
}
