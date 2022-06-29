package com.example;
import java.util.Scanner;

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
