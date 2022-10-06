package com.example;
import java.util.Scanner;
/*https://www.codechef.com/START59D/problems/HAPPYSTR*/

public class HAPPYSTR {
    public static void main (String[] args) throws java.lang.Exception
    {
    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    String s = sc.next();
            int count = 0;
            int flag = -1;
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i)== 'a'|| s.charAt(i) == 'e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'||s.charAt(i)=='u'){
                    count++;
                    if(count > 2){
                        flag = 0;
                        break;
                    }

                }
                else{
                    count = 0;
                    flag = 1;
                }


            }
            if(flag == 0){
                System.out.println("Happy");
            }
            else{
                System.out.println("Sad");
            }
            
    
}
    }
}
