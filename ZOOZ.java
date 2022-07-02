package com.example;
import java.util.Scanner;
/*Kulyash believes in equality.
Given an integer NN, output a binary string of length NN such that:

The count of 0101 subsequences in the string is equal to the count of 1010 subsequences;
The string has at least one occurrence of 00 as well as 11.
If multiple such strings exist, print any. Also, it is guaranteed that corresponding to the given input, an answer always exists.*/

public class ZOOZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            String aa = "0";
            for (int i = 0; i < a - 2; i++) {
                aa += "1";
                // else aa+="0";
            }
            aa += "0";
            System.out.println(aa);
        }
    }
}
