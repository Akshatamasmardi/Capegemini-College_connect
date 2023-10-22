package com.edu.offline;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int sum=0;
		int copynum=num;
		while(num>0) {
			int d=num%10;
			sum=sum+d*d*d;
			num=num/10;
		
		}
		
if(copynum == sum) {
	System.out.println("copynum+'is Armstrong number ");
}
	}

}
