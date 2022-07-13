package com.example;

import java.util.Scanner;

public class CHFRICH {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int current = sc.nextInt();
            int goal = sc.nextInt();
            int yearly = sc.nextInt();
            int rem = goal - current;
            int years = rem/yearly;
            if(rem%yearly==0){
                System.out.println(years);
            }
            else if(yearly>rem){
                System.out.println(1);
            }
            else{
                System.out.println((rem%yearly) + years);
            }
        }

    }

}
