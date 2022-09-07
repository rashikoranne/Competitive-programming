package com.example;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class slowsoln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int maxt = sc.nextInt();
		    int maxn = sc.nextInt();
		    int sumn = sc.nextInt();
		    
		    if (maxt*maxn <= sumn) {
		        System.out.println(maxt*maxn*maxn);
		    } else {
		        int test = sumn/maxn;
		        long result = test * (long)Math.pow(maxn,2) + (long)Math.pow(sumn - test*maxn, 2);
		        System.out.println(result);
		    }
           
            
        
            
            
        }

        
    }
    
}
