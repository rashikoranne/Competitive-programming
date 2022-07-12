package com.example;

import java.util.Scanner;

public class WHICHDIV {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int r = sc.nextInt();
            if(r>=2000){
                System.out.println(1);
            }
            else if(r<2000 && r>=1600){
                System.out.println(2);
            }
            else{
                System.out.println(3);
            }
        }

    }
}
