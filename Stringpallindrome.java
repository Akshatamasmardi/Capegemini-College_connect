package com.edubrige;
import java.util.Scanner;
public class Stringpallindrome {
	public static boolean isPalindrome(String str) {
		String rev = "";
		boolean ans = false;
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			ans = true;
		}
		return ans;	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter String :");
     String str=sc.nextLine();
     
     str = str.toLowerCase();
		boolean A = isPalindrome(str);
		System.out.println("Is Palindrome :"+A);
	}

}






