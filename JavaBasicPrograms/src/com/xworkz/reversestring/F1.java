package com.xworkz.reversestring;

public class F1 {
	
	public static void main(String[] args) {
		
		int rows=5;
		int cols=6;
		
		//outer loop for rows
		for(int i=1;i<=rows;i++) {
			//inner loop for columns
			for(int j=1;j<=cols;j++) {
                if(i==1||j==1||i==rows||j==cols) {
                	System.out.print("*");
                }else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
