package com.example;

import java.util.Scanner;

public class min_lights_to_activate {
    
    public static void main (String[] args) throws java.lang.Exception
    {
        int[] A = new int[]{0, 0, 1, 1, 1, 0, 0, 1};
        int B = 3;
        System.out.println(solve(A, B));;
        
        
        
    }
    static int solve(int[] A, int B) {
        int n = A.length;
         int i = 0;
         int count = 0;
         while(i < n) {
             boolean isBulbLighted = false;
             int lr = Math.max(i - B + 1, 0);
             int rr = Math.min(i + B - 1, n - 1);
             // 0, 0, 1, 0, 1, 0, 0, 1
 
             for(int j = rr; j >= lr; j--) {
                 if(A[j] == 1) {
                     count++;
                     i = j;
                     i += B;
                     isBulbLighted = true;
                     break;
                 }
             }
             
             if(!isBulbLighted) {
                 return -1;
             }
         }
         return count;
         
     }
    
}