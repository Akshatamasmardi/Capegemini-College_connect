package javaprograms;

public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
		
			for(int j=1;j<i;j++) 
				System.out.print(" ");
			int b=1;
			a=b;
			for(int j=i;j<=5;j++) { 
			    System.out.print(a);
			    a++; 
			}   
			System.out.println("");
		}
	}

}
