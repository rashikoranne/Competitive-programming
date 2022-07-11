package com.example;

import java.util.Scanner;

public class DPOLY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int a=sc.nextInt();
            int b[]=new int[a];
            for(int i=0;i<a;i++)
                b[i]=sc.nextInt();
            int c=a-1;
            for(int i=a-1;i>=0;i--){
                if(b[i]!=0){
                    System.out.println(c);
                    break;
                }
                c--;
            }
            t=t-1;
        }
    }
}
