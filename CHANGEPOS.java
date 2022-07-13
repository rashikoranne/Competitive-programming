package com.example;

import java.util.Scanner;

public class CHANGEPOS {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if(a!=c && b!=d){
                System.out.println(1);
            }
            else{
                System.out.println(2);
            }
        }
    }
}

