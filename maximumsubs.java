package com.example;

import java.util.Scanner;

public class maximumsubs {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int total = (x*60) - 5;
            int que = total/30;
            System.out.println(que+1);
        }
        
    }
    
}
