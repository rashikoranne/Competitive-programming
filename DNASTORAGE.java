package com.example;

import java.util.Scanner;
/*For encoding an even-length binary string into a sequence of A, T, C, and G, we iterate from left to right and replace the characters as follows:

00 is replaced with A
01 is replaced with T
10 is replaced with C
11 is replaced with G
Given a binary string SS of length NN (NN is even), find the encoded sequence.*/

public class DNASTORAGE {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            for(int i=0;i<s.length();i+=2)
            {
                if(s.charAt(i)=='0'&&s.charAt(i+1)=='0') System.out.print("A");
                else if(s.charAt(i)=='0'&&s.charAt(i+1)=='1') System.out.print("T");
                else if(s.charAt(i)=='1'&&s.charAt(i+1)=='0') System.out.print("C");
                else if(s.charAt(i)=='1'&&s.charAt(i+1)=='1') System.out.print("G");
            }
            System.out.println(" ");
            t--;
        }

    }
}
