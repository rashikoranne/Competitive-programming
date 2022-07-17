package com.example;

import javax.sound.sampled.AudioSystem;
import java.util.Scanner;

public class TFPAPER {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int a = x/3;
            int breaks = a * z;
            if(x<=3){
                System.out.println(x*y);
            }
            else if(x%3==0){
                System.out.println(((x*y)+breaks)-z);
            }
            else{
                System.out.println((x*y)+breaks);
            }
        }
    }
}
