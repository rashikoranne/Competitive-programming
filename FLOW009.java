package com.example;

import java.util.Scanner;
/*While purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 1000.
If the quantity and price per item are input, write a program to calculate the total expenses.*/

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
