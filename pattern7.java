package com.edubridge;

public class pattern7 {

	public static void main(String[] args) {
		int a=5;
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
		
			for(int j=1;j<i;j++) 
				System.out.print(" ");
			int b=5;
			a=b;
			for(int j=i;j<=5;j++) { 
			    System.out.print(a);
			    a--;
			 
			}   
			System.out.println("");
		}
	}

}
