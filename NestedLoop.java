package com.edu.offline;

public class NestedLoop {

	public static void main(String[] args) {
		//for(int i=1;i<=3;i++) {
			//for(int j=1;j<=i;j++) {
			//	System.out.println("i="+i+" and j="+j);
				//System.out.println("* ");
		
			int r=4;
			for(int i=1;i<r;i++) {
				//blank
				for(int b=1;b<=r-i;b++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
	}

}
