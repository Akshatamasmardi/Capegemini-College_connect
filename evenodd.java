package com.edu.offline;

public class evenodd {

	public static void main(String[] args) {
		
		
				int n = 100;
				int evenSum = 0;
				int oddSum = 0;

				for (int i = 1; i <= 100; i++) {
					if ((i%2==0)
							{
						
						evenSum += i;}
					else {
						oddSum += i;
				}
				// Sum of even numbers less than 17
				System.out.println("Sum of First " + n
								+ " Even numbers = " + evenSum);

				// sum of odd numbers less than 17
				System.out.println("Sum of First " + n
								+ " Odd numbers = " + oddSum);
			}	

	}
}


