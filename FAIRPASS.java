package com.example;

import java.util.Scanner;

public class FAIRPASS {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(k>=(n+1)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
