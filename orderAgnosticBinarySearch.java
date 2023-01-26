package com.example;

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{33,21,15,10,5,2};
        int target = 21;
        
        if(arr[0]>arr[1]){
            System.out.println(search1(arr, target));
        }
        else{
            System.out.println(search(arr, target));
        }
    }
        
    
    

static int search(int[] arr, int target){
    int start = 0; 
    int end = arr.length-1;
   
    while(start<=end){
        int mid = start + (end-start)/2;
        if(target>arr[mid]){
            start = mid+1;
        }
        else if(target<arr[mid]){
            end = mid - 1;
        }
        else{
            return mid;
        }

        
    }
    return -1;


}
static int search1(int[] arr, int target){
    int start = 0; 
    int end = arr.length-1;
    
    while(start<=end){
        int mid = start + (end-start)/2;
        if(target<arr[mid]){
            start = mid+1;
        }
        else if(target>arr[mid]){
            end = mid - 1;
        }
        else{
            return mid;
        }

        
    }
    return -1;


}
}
