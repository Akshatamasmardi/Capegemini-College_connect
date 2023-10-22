package com.edubrige;

import java.util.Scanner;

public class AarryEx {

	public static void main(String[] args) {
		// Array Declaration and Traversing
		Scanner sc=new Scanner(System.in);
		int []a1= {10,20,30};
		int []a2= {10,20,30};
		int []a3=new int[3];
		int []a4=new int[3];
		for(int i=0;i<a4.length;i++) {
			a4[i]=sc.nextInt();
		}
		for(int i=0;i<a3.length;i++) {
			a3[i]=a1[i]+a2[i];
		}
		for(int j=0;j<a3.length;j++) {
			System.out.print(a3[j]+" ");
		}
		
	}

}
