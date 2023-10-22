package com.edubrige;

import java.util.Scanner;

public class StringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter String:");
      String str=sc.nextLine();
      String s="SIT COE,Yadrav";
      //store in heap memory but we use intern then String constant pool
      String str1=new String("SIT");
      String str2=new String("SIT");
      System.out.println(str1==str2);
      
      System.out.println("tolowercase :"+str.toLowerCase());
      System.out.println("to uppercase :"+str.toUpperCase());
      System.out.println("Start with :"+str.startsWith("sit"));
      System.out.println("end with :"+str.endsWith("coe"));
      System.out.println("CharAt :"+str.charAt(4));
      System.out.println("length :"+str.length());
     //System.out.println("replace :"+s.replace('Yadrav','YADRAV'));
	}

}
