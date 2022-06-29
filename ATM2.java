package com.example;
import java.util.Scanner;

public class ATM2 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[] =new int[n];
            String s=" ";
            for(int j=0;j<n;j++)
                arr[j]=sc.nextInt();
            for(int j=0;j<n;j++)
            {
                if(k>=arr[j])
                {
                    s=s+"1";
                    k=k-arr[j];
                }
                else
                    s=s+"0";
            }
            System.out.println(s);

        }
    }
}
