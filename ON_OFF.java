package com.example;

import java.util.Scanner;

public class ON_OFF {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String r = sc.next();
            int count = 0;
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i) != r.charAt(i)){
                    count++;
                }

            }
            if(count%2==0){
                System.out.println(1);
            }

            else{
                System.out.println(0);
            }




        }
    }
}