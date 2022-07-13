package com.example;

import java.util.Scanner;

public class UTKPLC {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            char a = sc.next().charAt(0);
            char b = sc.next().charAt(0);
            char c = sc.next().charAt(0);
            char x = sc.next().charAt(0);
            char y = sc.next().charAt(0);
            if(x == a || y == a){
                System.out.println(a);
            }
            else{
                System.out.println(b);
            }






        }
    }
    }

