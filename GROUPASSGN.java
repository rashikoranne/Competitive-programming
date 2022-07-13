package com.example;

import java.util.Scanner;
/*https://www.codechef.com/submit/GROUPASSGN*/

public class GROUPASSGN {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int totalstu = 2 * n;
            int roll = Math.abs(x-totalstu);
            System.out.println(roll+1);
        }


    }

}
