package com.example;

import java.util.Scanner;

public class CHEFBARBER {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int total = n * m;
            System.out.println(total);
        }
    }
}
