package com.example;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class ZCOSSH {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        if(r>=1 && r<=50){
            System.out.println(100);
        }
        else if(r>=51 && r<=100){
            System.out.println(50);
        }
        else{
            System.out.println(0);
        }

    }
}
