package com.example;
import java.util.Scanner;

public class twotrain {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int sum = 0; int diff = 0;
            int[] A = new int[n];
            int[] B = new int[n];
            
            for(int i = 1; i<n; i++){
                A[i] = sc.nextInt();
                sum+=A[i];
                B[i] = A[i];
                A[i] = sum;
            }

            for(int i = 0; i<n-1; i++){
                diff = A[i+1] - B[i];
            if(diff>0){
                B[i+1] = B[i] + diff + B[i+1];

            }
            else{
                B[i+1] = B[i] + B[i+1];
            }
            }
            System.out.println(B[n-1]);
        
            


                }
            }
        }

        
    

