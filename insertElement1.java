package com.edu.methods;

import java.util.Scanner;

public class insertElement1 {

	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter size of an array");
	  int n=sc.nextInt();
	  int arr[]=new int[n];
	  System.out.println("Position of element");
	  int pos=sc.nextInt();
	  System.out.println("Element to be insert");
	  int ele=sc.nextInt();
	  System.out.println("enter the elements");
	        for(int i=0;i<arr.length;i++) {
	   arr[i]=sc.nextInt();
	  }
	  int newArray[]=new int[n+1];
	  
	  for(int i=0;i<pos-1;i++) {
	   newArray[i]=arr[i];
	  }
	  newArray[pos-1]=ele;
	  for(int i=pos;i<newArray.length;i++) {
	   newArray[i]=arr[i-1];
	  }
	  
	  //printing elements
	  System.out.println("After insering the elment new array is");
	  for(int i=0;i<newArray.length;i++) {
	   System.out.print(newArray[i]+" ");
	  }
	 }
}
	 

	/*}public class insertElement {

	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter size of an array");
	  int n=sc.nextInt();
	  int arr[]=new int[n];
	  System.out.println("Position of element");
	  int pos=sc.nextInt();
	  System.out.println("Element to be insert");
	  int ele=sc.nextInt();
	  System.out.println("enter the elements");
	        for(int i=0;i<arr.length;i++) {
	   arr[i]=sc.nextInt();
	  }
	  int newArray[]=new int[n+1];
	  
	  for(int i=0;i<pos-1;i++) {
	   newArray[i]=arr[i];
	  }
	  newArray[pos-1]=ele;
	  for(int i=pos;i<newArray.length;i++) {
	   newArray[i]=arr[i-1];
	  }
	  
	  //printing elements
	  System.out.println("After insering the elment new array is");
	  for(int i=0;i<newArray.length;i++) {
	   System.out.print(newArray[i]+" ");
	  }
	 }

	}
*/