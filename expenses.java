package com.example;

import java.util.Scanner;

public class expenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
            int b = x;
		    double total = Math.pow(2, b);
		    while(n>0){
		        total = total/2;
                n--;
		        
		    }
		    System.out.println((int)total);
		}
    }

    
}
