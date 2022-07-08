package com.example;

import java.util.Scanner;
/*There are N children and Chef wants to give them 1 candy each. Chef already has X candies with him. To buy the rest, he visits a candy shop. In the shop, packets containing exactly 4 candies are available.

Determine the minimum number of candy packets Chef must buy so that he is able to give 1 candy to each of the N children.*/

public class CHEFCAND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int count = 0;
            int remaining = n - x;
            while (remaining > 0) {
                remaining -= 4;
                count++;
            }
            System.out.println(count);
        }
    }
}
