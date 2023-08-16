package com.eculant.hallow;

public class Hill {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<i;k++) {
				if(i==n||k==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int l=1;l<=i;l++) {
				if(i==n||l==i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
