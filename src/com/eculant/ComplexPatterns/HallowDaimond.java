package com.eculant.ComplexPatterns;

public class HallowDaimond {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<i;k++) {
				if(k==1)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++) {
				if(l==i)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println("");
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<n;k++) {
				if(k==i)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			for(int l=i;l<=n;l++) {
				if(l==n)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
