package com.example;

import java.util.Scanner;



public class CANDY123 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
           
            for(int j=1;true;j++){
		        if(j%2==0){
		            b=b-j;
		            if(b<0){
		                System.out.println("Limak");
		                break;
		            }
		        }
		        else{
		            a=a-j;
		            if(a<0){
		                System.out.println("Bob");
		                break;
		            }
		        }
            }
            
           
        }
    
}
}
