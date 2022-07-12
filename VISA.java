package com.example;

import java.util.Scanner;
/*Ash is trying to get visa to Chefland. For the visa to be approved, he needs to satisfy the following three criteria:

Solve at least x1 problems on Codechef.
Have at least y1 current rating on Codechef.
Make his last submission at most z1 months ago.
You are given the number of problems solved by Chef (x2) 
his current rating (y2) and the information that he made his last submission (z2) months ago. 
Determine whether he will get the visa.*/

public class VISA {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            int z1 = sc.nextInt();
            int z2 = sc.nextInt();
            if(x1<=x2 && y1<=y2 && z1>=z2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
