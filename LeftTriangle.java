package com.edubridge;

public class LeftTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=4,c=6;
		for(int i=1;i<=r;i++) {//row
			/*for(int b=1;b<=r-i;b++) {
				System.out.print(" ");
			}*/
			for(int j=1;j<=i;j++) {//column
				//System.out.print("*"+" ");
				//System.out.print(i+" ");
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
