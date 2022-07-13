package com.example;

import java.util.Scanner;

public class CARCHOICE {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            float x1 = sc.nextInt();
            float x2 = sc.nextInt();
            float y1 = sc.nextInt();
            float y2 = sc.nextInt();
            float diesel = y1/x1;
            float petrol = y2/x2;
            if(diesel < petrol){
                System.out.println(-1);
            }
            else if(diesel==petrol){
                System.out.println(0);
            }
            else{
                System.out.println(1);
            }
        }
    }
}
