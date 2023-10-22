package com.edu.methods;

public class MultidimensionalArray {

	public static void main(String[] args) {
		int[][]name= {{20,30,40},{34,67,89},{23,45,67}};
		int copy[][]=name.clone();
		for(int i=0;i<name.length;i++) {
			System.out.println(" ");
		
		for(int j=0;j<name[i].length;j++) {
			System.out.print("  "+copy[i][j]);
		}
		}

	}
}


