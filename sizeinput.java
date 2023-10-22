package com.edu.methods;
import java.util.Scanner;

public class sizeinput {
	public static void main(String args[]) {
	
		
		int a[];
		int size;
			
			//for (int i=0;i<a.length;i++) {
			//	System.out.println(a[i]);
			//}
	         Scanner sc=new Scanner(System.in);
	         System.out.println("Enter size of an array ");
	        	 size=sc.nextInt();
	        	 a=new int[size];
	         
	         System.out.println("Enter:"+a.length+" elements");
	         /*for(int i=0;i<a.length;i++) {
	         for(int i:a) {
	        	 
	        	 //System.out.println(a[i]);
	        	 System.out.println(i);
	         }
	         
	         int sum=0;
	         for(int i:a) {
	        	 sum=sum+i;
		}
	         System.out.println("sum"+sum);
	         float avg=0;
	         avg=(float)sum/a.length;
	         System.out.println("Avg="+avg);
	         
	         int max=a[0];
	         //int min=a[0];
	         for(int i=1;i<a.length;i++) {
	        	 if(a[i]>max) {
	        	 
	        	 
	        		 max=a[i];
	        	 }
	         }
                     System.out.println("Largest of all array elements"+max);


      int min=a[0];
      for(int i=1;i<a.length;i++) {
    	  if(a[i]<min) {
	        	 
	        	 
     		 min=a[i];
     	 }
    	  
      }
             System.out.println("smallest of all array elements"+min);*/
		int pos=0; 
		
		
		System.out.println("enter an element to search");
		int key=sc.nextInt();
		a=new int[key];
		for(int i=0;i<a.length;i++) {
			if(key==a[i]) {
				pos=pos+i;
				break;
			}
		}
		if(pos>0) {
			System.out.println("successful search");
			System.out.println(key+"present at position"+(pos+1));
			
		}else {
			System.out.println(key +"not found");
			System.out.println("unsuccesful search");
		}
      }
	}


