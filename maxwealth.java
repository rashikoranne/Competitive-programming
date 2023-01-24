package com.example;

public class maxwealth {
    public static void main(String[] args) {
        int[][] accounts = new int[][]{{1,2,3},{3,2,1}};
        System.out.println(maxw(accounts));

        
    }
     static int  maxw(int[][] accounts){
        int max = Integer.MIN_VALUE;
        
        for(int person = 0; person<accounts.length; person++){
            int sum = 0;
            for(int account = 0; account<accounts[person].length; account++){
                sum += accounts[person][account];
                

            }
            if(sum>max){
                max = sum;
            }
        }
        return max;

    }
    
}
