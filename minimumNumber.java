package com.example;

public class minimumNumber {
    public static void main(String[] args) {
        int[] arr = {18, 3, -8, 6, -4, 5, 2};
        System.out.println(search(arr));
    }
    static int search(int[] arr){
        int min = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    
}
