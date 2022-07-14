package com.example;

public class StringReverseArray {
    public static void main(String[] args) {
        String s = "Egyptian Mythology is very intriguing ";
        String[] arr = null;
        System.out.println(rev(s, arr));



    }
    static String rev(String s, String[] arr){
        arr = s.split("");
        String backwards = "";
        for(int i = arr.length-1; i>=0; i--){
            backwards += arr[i];

        }
        return backwards;


    }
}
