package com.edubridge;
import java.util.Scanner; 
public class SericeSum2 {
	static double sum(int n) 
	{ 
	double i, s = 0.0; 
	for (i = 1; i <= n; i++) 
		s = s + 1/i; 
	return s; 
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int n = sc.nextInt(); 
		System.out.printf("Sum is %f", sum(n)); 
	}

}



