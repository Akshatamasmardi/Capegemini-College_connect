package pattern;

public class patternH4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;//row
		int b=a-1;//space
     for(int i=1;i<=a;i++) {
    	 for(int j=1;j<=b;j++) {
    		System.out.print(" "); 
    	 }
    	 b--;
    	 for(int j=1;j<=2*i-1;j++) {
    		 System.out.print("*"); 
    	 }
    	 System.out.println(""); 
     }
	}

}
