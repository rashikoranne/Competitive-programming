package com.example;

import java.util.Scanner;
/*Recently, Devendra went to Goa with his friends. Devendra is well known for not following a budget.

He had Rs. ZZat the start of the trip and has already spent Rs. Y on the trip. There are three kinds of water sports one can enjoy, with prices Rs. A, B, and C. He wants to try each sport at least once.

If he can try all of them at least once output YES, otherwise output NO.*/

public class DEVSPORTS {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int z = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int rem = z - y;
            if(a+b+c<=rem){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

        }
}
