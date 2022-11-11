package com.example;
//print all the three digit armstrong number

import java.util.Scanner;

import javax.print.attribute.standard.OrientationRequested;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
    }
    static boolean isArmstrong(int a){
        int org = a;
        int sum = 0;
        while(a>0){
            
            int rem = a % 10;
            int cube = rem*rem*rem;
            sum+=cube;
            a = a/10;
            
        

    } 
    if(sum == org){
        return true;

    }
    return false;
    

    }
    
}

