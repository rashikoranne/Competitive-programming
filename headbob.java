package com.example;
import java.util.Scanner;

public class headbob {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String bob = sc.next();
            String result = "";
            int count = 0;
            for(int i = 0; i<bob.length(); i++){
                if(bob.charAt(i) == 'Y'){
                    count = 1;
                    break;
                    
                    
                    
                    
                    
                }
                
                else if(bob.charAt(i) == 'I'){
                    count = 2;
                    break;
                    


                }
                else{
                    count = 3;
                    
                    
                }

                }
                if(count == 1){
                    System.out.println("NOT INDIAN");
                }
                else if(count == 2){
                    System.out.println("INDIAN");
                }
                else if(count == 3){
                    System.out.println("NOT SURE");
                }
            }

        }
    }
    

