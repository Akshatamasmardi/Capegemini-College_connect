package com.edu.methods;

public class EvenPositionofAnArray {

	public static void main(String[] args) {
		
		int array[]= {1,2,3,5,6};
		for(int i=0;i<array.length;i++) {
			if((i+1)%2==0) {
				System.out.println(array[i]+"");
			}
		}
		
	}

}
