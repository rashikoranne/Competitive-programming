package com.example;

import java.util.Scanner;

public class CCISLAND {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int xr = sc.nextInt();
            int yr = sc.nextInt();
            int d = sc.nextInt();
            int min = Math.min(x/xr,y/yr);
            System.out.println(min>=d?"Yes":"No");
        }
    }
}
