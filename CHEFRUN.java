package com.example;

import java.util.Scanner;

public class CHEFRUN {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            float x1 = sc.nextInt();
            float x2 = sc.nextInt();
            float x3 = sc.nextInt();
            float v1 = sc.nextInt();
            float v2 = sc.nextInt();
            float t1 = (Math.abs(x3-x1)/v1);
            float t2 = (Math.abs(x3-x2)/v2);
            if(t1<t2){
                System.out.println("Chef");
            }
            else if(t2==t1){
                System.out.println("Draw");
            }
            else{
                System.out.println("Kefa");
            }
        }
    }
}
