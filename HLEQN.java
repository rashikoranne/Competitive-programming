package com.example;
import java.util.Scanner;

public class HLEQN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            
            int flag = 0;
            
            for(int i = 1; i * i<x ; i++){
                if((x-2*i)!=0 && (x-2*i)%(2+i)==0){
                    flag = 1;
                    break;
                }

                }
            
            if(flag==1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            
            
        }
    }
    
}
