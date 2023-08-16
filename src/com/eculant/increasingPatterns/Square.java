package com.eculant.increasingPatterns;

public class Square {

	public static void main(String[] args) {
		
		int n=5;
		//i is for rows and j is for columns
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++){
				
				System.out.print("*");
			}
			//this statement is used to put the end to the j loop and restart the i loop with enter
			System.out.println();
		}
	}

}
