package pattern;

public class patternH1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coef=1;
		for(int i=0;i<5;i++) {
			for(int j=1;j<5-i;++j) {
				System.out.print(" ");}
		for(int j=0;j<=i;j++) {
			if(j==0||i==0)
				coef =1;
			else
				coef=coef*(i-j+1)/j;
			System.out.printf("%4d",coef);
		}
    System.out.println();
	}
	}
}
