package com.example;
import java.util.Scanner;

public class equalise {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>b){
                while(a>b){
                    b = b * 2;
                }
                if(a==b){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            else if(b>a){
                while(b>a){
                    a = a * 2;
                }
                if(a==b){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            else if(a==b){
                System.out.println("Yes");
            }
           
            
        }
        
    }
    
}
