package com.eculant.increasingPatterns;

public class RightTraingle {

	public static void main(String[] args) {
		
		int n=5;
		//j size is <= i because it will print as number of stars in columns as initializaition in i
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
