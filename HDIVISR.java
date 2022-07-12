package com.example;

import java.util.Scanner;
/*You are given an integer N. Find the largest integer between 1 and 10 (inclusive) which divides N.*/

public class HDIVISR {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        int[] ar = new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int i = ar.length-1; i>=0; i--){
            if(n%ar[i]==0){
                num = ar[i];
                break;

            }

        }
        System.out.println(num);


    }
}
