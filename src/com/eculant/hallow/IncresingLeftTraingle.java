package com.eculant.hallow;

public class IncresingLeftTraingle {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i==n||j==i||j==1)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
