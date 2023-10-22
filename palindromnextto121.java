package com.edu.offline;

import java.util.Scanner;

public class palindromnextto121 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
	         
	       int num1=121;
	       System.out.println("Enter the number: ");  
	       int num2=sc.nextInt();
	       for(int i=num1;i<=num2;i++)
	       {
	           boolean temp=checkPalindrome(i);
	           if(checkPalindrome(i))
	           System.out.print(i+" ");
	       }
	        
	  }
	  public static boolean checkPalindrome(int num)
	  {
	      int r,sum=0;
	       int temp=num;    
	       while(num>0)
	       {    
	       r=num%10;    
	       sum=(sum*10)+r;    
	       num=num/10;    
	       }    
	        if(temp==sum)    
	        return true;  
	        else    
	        return false;
	 

	}

}
