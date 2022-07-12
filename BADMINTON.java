package com.example;

import java.util.Scanner;

public class BADMINTON {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int p = sc.nextInt();


            if(p%2!=0){
                System.out.println(p/2+1);
            }
            else{
                System.out.println(p/2 + 1);
            }
        }

    }
}
