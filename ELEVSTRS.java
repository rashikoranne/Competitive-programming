package com.example;
import java.util.Scanner;

public class ELEVSTRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            double t1 = n/v1;
            double t2 = (n * Math.sqrt(2))/v2;
           System.out.println(t1);
           System.out.println(t2);

        }
    }
    
}
