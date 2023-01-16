package com.example;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 4, 1}, 
            {18, 12, 3, 9},
            {78, 99, 34, 69},
            {18, 12}
        };
        int target = 34;
        System.out.println(search(arr, target));
    }
    static boolean search(int[][] arr, int target){
        for(int row = 0; row<arr.length; row++){
            for(int column = 0; column<arr[row].length; column++){
                if(target==arr[row][column]){
                    return true;

                }
            }
        }
        return false;



    }
    
}
