package com.example;

import java.util.Scanner;

public class DOLL {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] ar = new int[n];
            int count = 0;
            for(int i = 0; i<ar.length; i++){
                ar[i] = sc.nextInt();
            }
            for(int i = 0; i<ar.length; i++){
                if(ar[i]>k){
                    count++;
                }
            }
            System.out.println(count);
        }
        }
}
