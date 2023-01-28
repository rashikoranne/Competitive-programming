package com.example;

public class smolletter {
    public static void main(String[] args) {
        char[] arr = new char[]{'c','f','j'};
        char target = 'z';
        System.out.println(search(arr, target));
        //1 2 3 4 5
       // 4

    }
    static char search(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        int ans = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(letters[mid]>target){
                end = mid - 1;
                ans = mid;
                
            }
            else if(letters[mid]<=target){
                start = mid + 1;
                
        }
        
    }
    return letters[ans];


    
}
}
