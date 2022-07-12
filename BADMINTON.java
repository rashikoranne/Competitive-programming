package com.example;

import java.util.Scanner;
/*Chef is playing badminton today. The service rules of this singles game of badminton are as follows:

The player who starts the game serves from the right side of their court.
Whenever a player wins a point, they serve next.
If the server has won an even number of points during a game, then they will serve from the right side of the service court for the subsequent point.
Chef will be the player who begins the game.

Given the number of points PP obtained by Chef at the end of the game, please determine how many times Chef served from the right side of the court.*/

public class BADMINTON {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int p = sc.nextInt();


            if(p%2!=0){
                System.out.println(p/2+1);
            }
            else{
                System.out.println(p/2 + 1);
            }
        }

    }
}
