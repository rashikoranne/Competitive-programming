package com.example;

import java.util.Scanner;
/*Chef's phone has a total storage of SS MB. Also, Chef has 22 apps already installed on his phone which occupy XX MB and YY MB respectively.

He wants to install another app on his phone whose memory requirement is ZZ MB. For this, he might have to delete the apps already installed on his phone. 
Determine the minimum number of apps he has to delete from his phone so that he has enough memory to install the third app.*/

public class CHEFAPPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int s = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int occupied = x + y;
            if(z<=(s-occupied)){
                System.out.println(0);
            }
            else if(s-x >= z || s-y >=z){
                System.out.println(1);
            }
            else{
                System.out.println(2);
            }

        }
    }
}
