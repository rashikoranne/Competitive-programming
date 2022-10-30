package com.example;
import java.util.Scanner;

public class vdates {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int d = sc.nextInt();
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		    if(d>=l && d<=r){
		        System.out.println("Take second dose now");
		    }
		    else if(d>l && d>r){
		        System.out.println("Too Late");
		    }
		    else{
		        System.out.println("Too Early");
		    }
		}
    }
}
