package com.example;

import java.util.Scanner;

public class dominant2 {
     public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);   
    int t = sc.nextInt();
    while(t-->0){
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
    int [] fr = new int [arr.length];  
    int visited = -1; 
    
    for(int i = 0; i < arr.length; i++){  
        int count = 1;  
        for(int j = i+1; j < arr.length; j++){  
            if(arr[i] == arr[j]){  
                count++;  
                //To avoid counting same element again  
                fr[j] = visited;  
            }  
        }  
        if(fr[i] != visited)  
            fr[i] = count;  
    }  
     int newcount = 0;
    for(int j = 0; j < fr.length; j++){  
        if(fr[j] != visited){
            if(fr[j]>newcount){
                newcount=fr[j];
            }
        }
           
        
    }
    int res = 0;
    for(int i = 0; i<fr.length; i++){
        if(fr[i]==newcount){
            res++;
        }
    }  
    if(res>1 || res == 0){
        System.out.println("No");
    }
    else{
        System.out.println("Yes");
    }
    
}  
}
}
 


