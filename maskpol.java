package com.example;
import java.util.Scanner;

public class maskpol {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            if(a<=(n-a)){
                System.out.print(a);
            }
            else{
                System.out.println(n-a);
            }
        }
        

        }
    
}
