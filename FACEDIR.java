package com.example;

import java.util.Scanner;

public class FACEDIR {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String[] c = {"North", "East", "South", "West"};
        int t = sc.nextInt();
        while (t-->0){
            int x = sc.nextInt();
            System.out.println(c[x%4]);
            }
        }
    }

