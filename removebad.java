package com.example;
import java.util.Arrays;
import java.util.Scanner;

public class removebad {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] ar = new int[n];
            int maximum = 0;
            int count = 1;
            for(int i = 0; i<n; i++){
                ar[i] = sc.nextInt(); 
            }
            Arrays.sort(ar);
            for(int i = 1; i<n; i++){
                if(ar[i] == ar[i-1]){
                    count++;
                }
                else{
                    maximum = Math.max(maximum, count);
                    count = 1;
                }
                maximum = Math.max(maximum, count);
            }
            System.out.println(n - maximum);
        }

    }
    

    
}
