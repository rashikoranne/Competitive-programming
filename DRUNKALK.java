package com.example;

import java.util.Scanner;

public class DRUNKALK {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int k = sc.nextInt();
            int total = k/2;
            int rem = k - total;
            int fin = (rem*3)-(total);
            System.out.println(fin);


        }
    }
}
