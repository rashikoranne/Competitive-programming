package com.example;
import java.util.Scanner;

public class avg {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t,n,k,i,v,a;
        t=in.nextInt();
        while(t--!=0)
        {
        n=in.nextInt();
        k=in.nextInt();
        v=in.nextInt();
        a=0;
        for(i=0;i<n;i++)
        a+=in.nextInt();
        v*=n+k;
        v-=a;
        if(v%k==0&&v>0)
        System.out.println(v/k);
        else
        System.out.println("-1");
        }
        }
    }
    

