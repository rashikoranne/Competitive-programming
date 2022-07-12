package com.example;

import java.util.Scanner;
/*Alice and Bob play the classic game of odds and evens. In this game, each of the two players choose a number between 1 and 5 without revealing to their opponent. 
Both of the players then simultaneously reveal their number by holding up that many fingers of their hand.
Then the winner is decided based upon whether the sum of numbers played by both the players is odd or even. 
In this game we assume that if the sum is odd then Alice wins, otherwise Bob wins.

If Alice held up aa fingers and Bob held up bb fingers, determine who won the game.*/

public class ODDSEVENS {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int total = a + b;
            if(total%2==0){
                System.out.println("Bob");
            }
            else{
                System.out.println("Alice");
            }
        }
    }
}
