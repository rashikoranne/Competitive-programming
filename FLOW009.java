package com.example;

import java.util.Scanner;

public class FLOW009 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double quant = sc.nextInt();
            double price = sc.nextInt();
            double discount = (quant*price) - ((quant*price)*10)/100;
            if(quant<1000){
                System.out.println(quant*price);
            }
            else{
                System.out.println(discount);
            }
        }
    }
}
