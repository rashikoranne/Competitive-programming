package com.example;

import java.util.Scanner;

public class ODDSEVENS {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int total = a + b;
            if(total%2==0){
                System.out.println("Bob");
            }
            else{
                System.out.println("Alice");
            }
        }
    }
}
