package com.example;

import java.util.Scanner;

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
