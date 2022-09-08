package com.example;
import java.util.Arrays;
import java.util.Scanner;

public class CFRTEST {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int count = n;
            for(int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i = 0; i<arr.length-1; i++){
                
                    if(arr[i] == arr[i+1]){
                        count--;
                    }
                    else{
                        continue;
                    }
            
                
            }
            System.out.println(count);

        }
    }
    
}
