package com.example;

import java.util.Scanner;

public class CHEFCONTEST {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            int chef = x + (10*p);
            int chefina = y + (q*10);
            if(chef<chefina){
                System.out.println("Chef");
            }
            else if(chef==chefina){
                System.out.println("Draw");
            }
            else{
                System.out.println("Chefina");
            }
        }
    }
}
