package com.example;

import java.util.Scanner;

public class FILLCANDIES {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int m = sc.nextInt();
            int total = k * m;
            int count = 0;
            while(total<n){
                n = n - total;
                count++;


            }
            System.out.println(count+1);
        }
    }
}
