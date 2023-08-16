package com.eculant.increasingPatterns;
public class Hill {

	public static void main(String[] args) {
		
		//have three traingles
		/*
			1- Decreasing Right traingle print space
			2- Incresing left traingle print *
			3- Incresing Right traingle print *
			4- To print point then have to make size of second loop from <= to <
		 */
		
		int n=5;
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<i;k++) {
				System.out.print("*");
			}
			for(int l=1;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
