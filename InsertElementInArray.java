package com.edu.methods;

import java.util.ArrayList;

public class InsertElementInArray {


	
	public static void main(String[] args) {
		int[]a= {10,20,30,40,60,70,80};
		int index=4;
		int value=50;
		System.out.println("Before Insert"a);
		for(int i=a.length-1;i>index;i--) {
			a[i]=a[i-1];
		}
		a[index]=value;
		System.out.println("After Insert"+ArrayList.(a));
		
	}

}
