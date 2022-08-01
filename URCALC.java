package com.example;

import java.util.Scanner;
public class URCALC {
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        {
            double a = sc.nextInt();
            double b = sc.nextInt();
            char c = sc.next().charAt(0);
            if(c =='+'){
                System.out.println(String.format("%.6f", a+b));
            }
            if(c=='-'){
                System.out.println(String.format("%.6f", a-b));
            }
            if(c=='*'){
                System.out.println(String.format("%.6f", a*b));
            }
            if(c=='/'){
                System.out.println(String.format("%.6f", a/b));
            
         }

    }
    
}
}
