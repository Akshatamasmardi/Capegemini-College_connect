package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class deletelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int my_array[];
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		size=sc.nextInt();
		my_array=new int[size];
		System.out.println("Enter "+my_array.length+" element");
		for(int i=0;i<my_array.length;i++) {
			my_array[i]=sc.nextInt();
		}
		for(int i:my_array) {
			System.out.println(i);
		}
		   
	    System.out.println("Original Array : "+Arrays.toString(my_array));     
	
		   int removeIndex = 1;

		   for(int i = removeIndex; i < my_array.length -1; i++){
		        my_array[i] = my_array[i + 1];
		      }
		    System.out.println("After removing the second element: "+Arrays.toString(my_array));
	}

}
