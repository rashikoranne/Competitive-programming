package com.example;

import java.util.Scanner;

public class DEVSPORTS {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int z = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int rem = z - y;
            if(a+b+c<=rem){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

        }
}
