package pattern;

public class patternH6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6;
		int b=a-1;
		// TODO Auto-generated method stub
		for(int j=a;j>=1;j--) {
	    	 for(int i=j;i<a;i++) {
	    		System.out.print(" "); 
	    	 }
	    	 
	    	 for(int i=1;i<=(2*j-1);i++) {
	    		 System.out.print("*"); 
	    	 }
	    	 System.out.println(""); 
	     }
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
