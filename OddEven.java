package com.edu.Switchcase;

import java.util.Scanner;

public class OddEven {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int num;
  System.out.println("enter the number:");
  num=sc.nextInt();
	
  switch(num%2) {
  case 0:
   System.out.println("enter number "+num+" is Even");
   break;
  case 1:
   System.out.println("enter number "+num+" is odd");
   break;
  default:
   System.out.println("invalid");
  }

 }

}
