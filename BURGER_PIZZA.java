package com.example;
import java.util.Scanner;

public class BURGER_PIZZA {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if(x>=y){
		    System.out.println("PIZZA");	
		    }
		 else if(x<y && x>=z){
		        System.out.println("BURGER");
		    }
		 else{
		        System.out.println("NOTHING");
		        
		    }
		    
		
	}
		    
		
	}
    
}
