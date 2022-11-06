package com.example;
import java.util.Scanner;

public class EQCARDGAME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int k = sc.nextInt();
            System.out.println(52%k);
        }
        
    }
    
}
