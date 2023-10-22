package com.edu.methods;

public class twoDimenArray {

	public static void main(String[] args) {
		int[][]twoArray=new int[2][];
		twoArray[0]=new int[2];
		twoArray[1]=new int[1];
		
		int counter=2;
		for(int i=0;i<twoArray.length;i++) {
			for(int j=0;i<twoArray.length;j++) {
				twoArray[i][j]=counter++;
				
			}
		}
		for(int i=0;i<twoArray.length;i++) {
			System.out.println("");
			for(int j=0;j<twoArray.length;j++) {
				System.out.println(twoArray[i][j]+"");
			}
		}
	}

}
