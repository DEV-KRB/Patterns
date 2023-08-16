package com.eculant.increasingPatterns;

public class RightSidedTraingle {
	
	public static void main(String[] args) {
		
		int n=5;
		//decreasing space and increasing stars\
		for(int i=1;i<n;i++) {			//this for loop is the outer for loop for printing rows
			
			for(int j=i;j<=n;j++) {		//this is inner for loop is for pprinting spaces
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {		//this loop is for printing the stars
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
