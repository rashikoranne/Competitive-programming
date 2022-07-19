package com.example;

import java.util.Scanner;

public class CHEFVACATION {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (x + y <= z) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
