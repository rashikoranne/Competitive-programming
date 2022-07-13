package com.example;

import java.util.Scanner;

public class MODULO3 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int count = 0;
            if(a%3==0 || b%3==0){
                System.out.println(0);
            }
            else if(a%3==b%3 && b%3!=0){
                System.out.println(1);
            }
            else if(a%3!=b%3&&b%3!=0 && a%3!=0){
                System.out.println(2);

            }
        }
    }

}
