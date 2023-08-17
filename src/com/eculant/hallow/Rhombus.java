package com.eculant.hallow;

public class Rhombus {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				if(j==i||i==1)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(j==i||i==n)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
