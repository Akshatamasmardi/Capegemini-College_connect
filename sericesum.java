package com.edubridge;
import java.util.Scanner;

public class sericesum {
    public static void main(String[] args) 
    {
        double sum = 0;
        int n;
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the no. of terms in series:");
        n = sn.nextInt();
      sericesum  s = new  sericesum ();
        for(int i = 1; i <= n; i++)
        {
            sum = sum + (double)i / (s.fact(i));
        }
        System.out.println("Sum of series:"+sum);
    }
    int fact(int x)
    {
        int mul = 1;
       for(;x>0;x--)
        {
            mul = mul * x;
        }
        return mul;
    }
}


