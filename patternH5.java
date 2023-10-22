package pattern;

public class patternH5 {

	public static void main(String[] args) {
		
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

	}

}
