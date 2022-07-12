package com.example;

import java.util.Scanner;
/*Given the rating RR of a person, tell which division he belongs to. The rating range for each division are given below:

Division 1: 2000≤ Rating.

Division 2: 1600≤ Rating <2000.

Division 3: Rating<1600. 
For each test case, output on a single line the answer: 1 if the person belongs to Division 1, 2 if the person belongs to Division 2, and 3 if the person belongs to Division 3.*/

public class WHICHDIV {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int r = sc.nextInt();
            if(r>=2000){
                System.out.println(1);
            }
            else if(r<2000 && r>=1600){
                System.out.println(2);
            }
            else{
                System.out.println(3);
            }
        }

    }
}
