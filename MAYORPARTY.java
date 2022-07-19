package com.example;

import java.util.Scanner;

public class MAYORPARTY {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a+c>=b){
                System.out.println(a+c);

            }
            else{
                System.out.println(b);
            }
        }
    }
}
