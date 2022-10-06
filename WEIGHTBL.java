package com.example;

import java.util.Scanner;



public class WEIGHTBL {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int w1 = sc.nextInt();
            int w2 = sc.nextInt();
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int m = sc.nextInt();
            int weight1 = x1*m;
            int weight2 = x2*m;
            if(w2-w1>=weight1&&w2-w1<=weight2){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
           
        }
        
        
    }
    
}
