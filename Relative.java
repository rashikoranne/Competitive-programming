package com.example;

import java.util.Scanner;
/*https://www.codechef.com/submit/RELATIVE*/

public class Relative {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int g = sc.nextInt();
            int c = sc.nextInt();
            int result  = (c * c)/(2*g);
            System.out.println(result);
        }

    }
}
