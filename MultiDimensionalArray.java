package com.edubrige;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
      int copy[][]=a.clone();
      for(int i=0;i<a.length;i++) {
    	  System.out.println();
    	  for(int j=0;j<a[i].length;j++) {
    		  System.out.print(" "+copy[i][j]);
    	  }
      }
      
	}

}
