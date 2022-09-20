package com.example;
import java.util.Scanner;

public class brokphon {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] ar = new int[n];
            for(int i = 0; i<ar.length; i++){
                ar[i] = sc.nextInt();
            }
            int count=0;
		    if(ar[0]!=ar[1])
		    count++;
		    for(int i=1;i<n-1;i++)
		    {
		        if(ar[i]!=ar[i-1]||ar[i]!=ar[i+1])
		        count++;
		    }
		    if(ar[n-2]!=ar[n-1])
		    count++;
		    System.out.println(count);
        }
    }
    
}
