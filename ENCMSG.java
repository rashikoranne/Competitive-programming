package com.example;
import java.util.Scanner;
import java.util.regex.*;
import java.io.*;
import java.math.*;
import java.text.*;

public class ENCMSG {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            char ch[] = s.toCharArray();
            if(ch.length%2==0){
            for(int i = 0; i<ch.length; i+=2){
                char temp = ch[i];
                ch[i] = ch[i+1];
                ch[i+1] = temp;

                
            }
            

        }
        else{
            for(int i = 0; i<ch.length-1; i+=2){
                char temp = ch[i];
                ch[i] = ch[i+1];
                ch[i+1] = temp;

                
            }
        }
        for(int i = 0; i<ch.length; i++){
            ch[i] = (char)(122 - (int)(ch[i]) + 97);
        }
        System.out.println(ch);
        
        }
            
        }
        
    }

            
        
    

