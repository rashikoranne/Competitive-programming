package com.example;

import java.util.Scanner;

public class CHEFCAND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int count = 0;
            int remaining = n - x;
            while (remaining > 0) {
                remaining -= 4;
                count++;
            }
            System.out.println(count);
        }
    }
}
