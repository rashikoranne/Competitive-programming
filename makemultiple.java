package com.example;
import java.util.Scanner;

public class makemultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b%a==0){
                System.out.println("Yes");
            }
            else if(a<=b/2){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
           
           
        }
    }
    
}
