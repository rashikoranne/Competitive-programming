package com.example;

import java.util.Scanner;

public class EZSPEAK {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            char ch;
            int count =0;
            int flag=0;
            for(int i=0;i<n;i++)
            {
                ch=s.charAt(i);
                if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
                {
                    count++;
                }
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    count=0;
                if(count==4)
                {
                    flag=1;
                    break;
                }
            }

            if(flag==1)
                System.out.println("No");
            else
                System.out.println("Yes");


        }
    }

}
