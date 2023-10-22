package com.edu.condition;

import java.util.Scanner;

public class Grade {
	int marks;
	void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
		 marks = sc.nextInt();
		

}
	void displayGrade() {
		if(marks< 0 || marks >100) {
			System.out.println("Invalid input");
		}
		else if(marks>=80 && marks<=100) {
			System.out.println("Grade A");
		}
		else if(marks>=60 && marks<=79) {
			System.out.println("Grade B");
		}
		else if(marks>=40 && marks<=69) {
			System.out.println("Grade C");
			
		}
		else if(marks>=0 && marks<=39) {
			System.out.println("Fail");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade grade=new Grade();
		grade.inputData();
		grade.displayGrade();
	}

}
