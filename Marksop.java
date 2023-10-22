package com.edu.condition;

import java.util.Scanner;

public class Marksop {
	char grade;
	void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Grade");
		 grade = sc.next().toUpperCase().charAt(0);
		
}
	void displayMarks() {
		if(grade=='A') {
			System.out.println("marks is in between 80-100 ");
		}
		else if(grade=='B') {
			System.out.println("marks is in between 60-79");
		}
		else if(grade=='C' ) {
			System.out.println("marks is in between 40-5 9");
		}
		else if(grade=='F') {
			System.out.println("marks is in between 0-39");
			
		}
		else{
			System.out.println("invalid input");
	}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marksop M=new Marksop();
		M.inputData();
		M.displayMarks();

	}

}
