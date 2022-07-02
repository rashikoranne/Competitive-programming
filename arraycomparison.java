package com.example;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
/*In this question we simply have to find that if in an array such elements exist that the larger element is divisible by the immediate smaller one and so on
but the elements may or may not be sorted or in increasing order.
 */

public class arraycomparison {
   public static void main(String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int[] ar = new int[r];
        for(int i = 0; i<ar.length; i++){
            ar[i] = sc.nextInt();
        }
        String result = "";
        Arrays.sort(ar);
        for(int i = 0; i<r-1; i++) {
            for (int j = 0; j < r-1; j++) {
                if (ar[i] < ar[j+1] && ar[j+1] % ar[i] == 0) {
                    result = "YES";

                } else {
                    result = "NO";
                }
            }
        }
        System.out.println(result);
    }
}

