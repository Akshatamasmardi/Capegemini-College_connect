package javaprograms;

public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=5;i++) {
			
			for(int j=i;j>1;j--) 
				System.out.print(" ");
			
			for(int j=i;j<=5;j++) { 
			    System.out.print((char)(j+64));
			  
			}   
			System.out.println("");
		}
	}

}