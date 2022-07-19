package com.example;

import java.util.Scanner;

public class CHFPROFIT {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int buy = x * y;
            int sell = x * z;
            System.out.println(sell-buy);
                


        }
    }
}
