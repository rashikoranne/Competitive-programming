package com.example;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.Arrays;






public class Snakproc {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        while(r-->0){
            int l=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            s=s.replace(".","");
            System.out.println(s.isEmpty()||s.matches("(HT)*")?"Valid":"Invalid");

        }
    }
}
