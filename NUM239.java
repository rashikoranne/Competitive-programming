package com.example;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class NUM239 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int count = 0;
            for(int i = l; i<=r; i++){
                int rem = i%10;
                if(rem==2 || rem==3 ||rem ==9){
                    count++;
                }
            }
            System.out.println(count);

        }


    }
}
