package com.xworkz.reversestring;

public class HollowTriangle {
	
	public static void main(String[] args) {
		
		int rows=5;
		int cols=6;
		
		//outer loop for rows
		for(int i=1;i<=rows;i++) {
			
			//inner loop for column
			for(int j=1;j<=cols;j++) {
				
			
			if(i==1 || j==1 || i==5 || j==6) {
				System.out.println("*");
			}
		}
			System.out.println();

	}
	}
}
