package com.example;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
/*Chef is fan of pairs and he likes all things that come in pairs. He even has a doll collection in which the dolls come in pairs. One day while going through his collection he found that there are odd number of dolls. Someone had stolen a doll!!!

Help chef find which type of doll is missing..*/

public class MISSP {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n ;i++ ){
                arr[i]=s.nextInt();
            }
            Arrays.sort(arr);
            for (int i=0;i<n-1 ;i=i+2 ){

                if(arr[i]!=arr[i+1]){
                    System.out.println(arr[i]);
                    break;}
            }
            if(arr[n-1]!=arr[n-2]){
                System.out.println(arr[n-1]);
                break;
            }
        }
    }
}
