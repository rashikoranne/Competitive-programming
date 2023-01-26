package com.example;

public class orderAgnostic2 {
    public static void main(String[] args) {
        int[] arr = new int[]{33,21,15,10,5,2};
        int target = 21;
        System.out.println(search(arr, target));
        
        
    }
        
    
    

static int search(int[] arr, int target){
    int start = 0; 
    int end = arr.length-1;
    boolean isasc = arr[start] < arr[end];
    
   
    while(start<=end){
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;

        }
        if(isasc){
            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid - 1;
            }
        }else{
            if(target<arr[mid]){
                start = mid+1;
            }
            else if(target>arr[mid]){
                end = mid - 1;

        }
    
       

    }

        
    }
    return -1;


}
}
    

