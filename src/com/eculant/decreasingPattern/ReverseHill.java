package com.eculant.decreasingPattern;

public class ReverseHill {
	
	public static void main(String[] args) {
		
		//have three traingles
				/*
					1- Right handed traingle print space
					2- Decreasing left traingle print *
					3- Decreasing Right traingle print *
					4- To print point then have to make size of second loop from <= to <
				 */
		
		int n=5;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<n;k++) {
				System.out.print("*");
			}
			for(int l=i;l<=n;l++) {
				System.out.print("*");
			}
			System.out.println("");
		}
}

}
