package com.example;

import java.util.Arrays;

public class swapelements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        swap(arr, 1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b]; 
        arr[b] = arr[temp];
        
    }
    
}
