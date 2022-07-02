package com.example;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
/*The annual snake festival is upon us, and all the snakes of the kingdom have gathered to participate in the procession. Chef has been tasked with reporting on the procession, and for this he decides to first keep track of all the snakes. When he sees a snake first, it'll be its Head, and hence he will mark a 'H'. The snakes are long, and when he sees the snake finally slither away, he'll mark a 'T' to denote its tail. In the time in between, when the snake is moving past him, or the time between one snake and the next snake, he marks with '.'s.

Because the snakes come in a procession, and one by one, a valid report would be something like "..H..T...HTH....T.", or "...", or "HT", whereas "T...H..H.T", "H..T..H", "H..H..T..T" would be invalid reports (See explanations at the bottom).

Formally, a snake is represented by a 'H' followed by some (possibly zero) '.'s, and then a 'T'. A valid report is one such that it begins with a (possibly zero length) string of '.'s, and then some (possibly zero) snakes between which there can be some '.'s, and then finally ends with some (possibly zero) '.'s.

Chef had binged on the festival food and had been very drowsy. So his report might be invalid. You need to help him find out if his report is valid or not.*/






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
