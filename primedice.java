package com.example;

import java.util.Scanner;

public class primedice {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int num = a + b;
            if(isPrime(num)){
		        System.out.println("Alice");
		    }
		    else{
		        System.out.println("Bob");
		    }
    }
    
}
static boolean isPrime(int n)
{
    
    if (n <= 1)
        return false;

    
    for (int i = 2; i < n; i++)
        if (n % i == 0)
            return false;

    return true;
}
}
