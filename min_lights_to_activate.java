package com.example;

import java.util.Scanner;
/*There is a corridor in a Jail which is N units long. Given an array A of size N. The ith index of this array is 0 if the light at ith position is faulty otherwise it is 1.

All the lights are of specific power B which if is placed at position X, it can light the corridor from [ X-B+1, X+B-1].

Initially all lights are off.

Return the minimum number of lights to be turned ON to light the whole corridor or -1 if the whole corridor cannot be lighted.*/

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
