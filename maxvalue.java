package com.example;


public class maxvalue {
    public static void main(String[] args) {
        int[] arr = {2, 4, 66, 3244, 23};
        System.out.println(max(arr));

    }
    static int max(int[] arr){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }


        }
        return max;
        

    }
    
}
