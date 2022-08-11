package com.example;
import java.util.Scanner;

public class airline {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            if((a+b<=d && c<=e) || (b+c<=d && a<=e) || ( a+c<=d && b<=e) ){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    
}
}
