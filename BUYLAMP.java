package com.example;

import java.util.Scanner;

public class BUYLAMP {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int remcost = (n-k)*y;
            int red = x * k;
            int total = red + remcost;
            if(y>x){
                System.out.println(x*n);
            }
            else {
                System.out.println(total);
            }

        }
    }
}
