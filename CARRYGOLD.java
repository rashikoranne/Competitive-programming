package com.example;

import java.util.Scanner;

public class CARRYGOLD {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int carry = (n*y) + y;
            if(carry>=x){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
