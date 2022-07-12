package com.example;

import java.util.Scanner;
/*Write a program to obtain length (L) and breadth (B) of a rectangle and check whether its area is greater or perimeter is greater or both are equal.*/

public class AREAPERI {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

            int l = sc.nextInt();
            int b = sc.nextInt();
            int ar = l * b;
            int peri = 2* (l+b);
            if(ar>peri){
                System.out.println("Area");
                System.out.println(ar);
            }
            else if(peri>ar){
                System.out.println("Peri");
                System.out.println(peri);

            }
            else{
                System.out.println("Eq");
                System.out.println(ar);
            }
        }
    }

